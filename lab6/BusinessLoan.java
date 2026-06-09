package lab6;

public class BusinessLoan extends Loan{
    public BusinessLoan(int loanNum, String lastName, double amount, int term, double primeRate) {
        super(loanNum, lastName, amount, term);
        this.interest = primeRate + 0.01;
    }
}
