public class CreditCalc {
    protected static final double interestRate = 0.18;
    protected static final double loanAmount = 1_000_000;
    protected static final int loanTerm = 36;

    public int getLoanTerm() {
        return loanTerm;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }


    public double monthlyPayment() {
        return 0.00;
    }

    public double fullCostOfTheLoan() {
        return 0.00;
    }

    public double overpaymentForTheEntirePeriod() {
        return 0.00;
    }
}
