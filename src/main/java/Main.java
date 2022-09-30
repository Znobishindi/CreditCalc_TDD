

public class Main {
    public static void main(String[] args) {
        CreditCalc creditCalc = new CreditCalc();
        System.out.printf("""
                Начинаю расчет параметров кредита со следующими данными:
                Сумма займа %.2f рублей
                Срок займа %d месяцев
                Процентная ставка %.2f годовых""", creditCalc.getLoanAmount(), creditCalc.getLoanTerm(), creditCalc.getInterestRate());

        System.out.printf("""


                Ежемесячный платеж по кредиту составит %.2f рублей
                Полная стоимость займа составит %.2f рублей
                Ваша переплата за весь период составит %.2f рублей""",
                creditCalc.monthlyPayment(), creditCalc.fullCostOfTheLoan(),creditCalc.overpaymentForTheEntirePeriod());

    }
}
