package lab6;

public abstract class Loan implements LoanConstants {
    protected int loanNumber;
    protected String customerName;
    protected double amount;
    protected double interest;
    protected int term;

    Loan(int loanNumber, String customerName, double amount, int term) {
        this.loanNumber = loanNumber;
        this.customerName = customerName;
        if (amount > MAX_LOAN) {
            System.out.println("Loan max overflowed! Loan set to: " + MAX_LOAN);
            this.amount = MAX_LOAN;
        } else {
            this.amount = amount;
        }
        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    @Override
    public String toString() {
        double owed = amount + (amount * term * interest);
        return String.format("%s - Loan no. %d, Last name: %s, Amount: $%.2f, Interest rate: %.2f%%, Term: %d lat(a), Total owed: $%.2f",
                COMPANY_NAME, loanNumber, customerName, amount, (interest * 100), term, owed);
    }
}
