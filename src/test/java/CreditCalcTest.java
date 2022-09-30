import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CreditCalcTest {
    @BeforeAll
    public static void started() {
        System.out.println("Начат процесс тестирования");
    }

    @AfterAll
    public static void ended() {
        System.out.println("Процесс тестирования завершен");
    }

    public double getAnnuity() {
        CreditCalc creditCalc = new CreditCalc();
        double interestRate = creditCalc.getInterestRate();
        int loanTerm = creditCalc.getLoanTerm();
        double monthlyPercent = interestRate / 12;
        return (monthlyPercent * Math.pow((1 + monthlyPercent), loanTerm)) /
                (Math.pow((1 + monthlyPercent), loanTerm) - 1);
    }


    @Test
    public void monthlyPaymentTest() {
        CreditCalc creditCalc = new CreditCalc();
        double loanAmount = creditCalc.getLoanAmount();
        double annuity = getAnnuity();
        double expected = loanAmount * annuity;
        Assertions.assertEquals(expected, creditCalc.monthlyPayment());
    }

    @Test
    public void fullCostOfTheLoanTest() {
        CreditCalc creditCalc = new CreditCalc();

        int loanTerm = creditCalc.getLoanTerm();
        double loanAmount = creditCalc.getLoanAmount();
        double annuity = getAnnuity();
        double monthlyPayment = annuity * loanAmount;
        double expected = loanTerm * monthlyPayment;
        Assertions.assertEquals(expected, creditCalc.fullCostOfTheLoan());
    }

    @Test
    public void overpaymentForTheEntirePeriodTest() {
        CreditCalc creditCalc = new CreditCalc();
        int loanTerm = creditCalc.getLoanTerm();
        double loanAmount = creditCalc.getLoanAmount();
        double annuity = getAnnuity();
        double monthlyPayment = annuity * loanAmount;
        double fullCostOfTheLoan = loanTerm * monthlyPayment;
        double expected = fullCostOfTheLoan - loanAmount;
        Assertions.assertEquals(expected, creditCalc.overpaymentForTheEntirePeriod());
    }


}



