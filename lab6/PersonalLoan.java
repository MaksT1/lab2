package lab6;

public class PersonalLoan extends Loan{
    public PersonalLoan(int loanNum, String lastName, double amount, int term, double primeRate) {
        super(loanNum, lastName, amount, term);
        this.interest = primeRate + 0.02;
    }
}
