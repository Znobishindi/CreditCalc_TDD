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

    public double calculateAnnuity() {
        double monthlyPercent = interestRate / 12;
        return (monthlyPercent * Math.pow((1 + monthlyPercent), loanTerm)) /
                (Math.pow((1 + monthlyPercent), loanTerm) - 1);
    }

    public double monthlyPayment() {

        return loanAmount * calculateAnnuity();
    }

    public double fullCostOfTheLoan() {
        return monthlyPayment() * loanTerm;
    }

    public double overpaymentForTheEntirePeriod() {
        return fullCostOfTheLoan() - loanAmount;
    }
}
