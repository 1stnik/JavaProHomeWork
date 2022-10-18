package deposit;

public class DepositCalculator {

    static DepositInfo depositInfo;
    static double annualForYear;
    static double sumForYear;

    public static void main(String[] args) {

        depositInfo = new DepositInfo(64350, 12, 3);
        calcTotalInfo();
        calcSumForYear(depositInfo.getDepositSum(), depositInfo.getAnnualInterest());

    }

    public static void calcTotalInfo () {
        System.out.println("Сумма вклада: " + depositInfo.getDepositSum() + " грн." + "\nСтавка в год: " +
                depositInfo.getAnnualInterest() + " %" + "\nКол-во периодов (лет): " + depositInfo.getYears());
    }

    public static void calcSumForYear(double depositSum, double annualInterest) {
        for (int i = 1; i <= depositInfo.getYears(); i++) {
            annualForYear = depositSum * annualInterest / 100;
            System.out.println("Сумма процентов за " + i + "-й год: " + annualForYear * i + " грн.");
            sumForYear = depositInfo.getDepositSum() + annualForYear * i;
            System.out.println("Сумма вклада с процентами за " + i + "-й год: " + sumForYear + " грн.");
        }
    }
}
