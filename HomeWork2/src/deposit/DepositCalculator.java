package deposit;

// need to add in DepositCalculator arguments: 1000 16 5 (deposit sum) / (bank percent) / (for years)

public class DepositCalculator {

    static double monthInterest;
    static double depositSumTemp;

    public static void main(String[] args) {

        double depositSum = Double.valueOf(args[0]);
        double annualInterest = Double.valueOf(args[1]) / 12;
        int years = Integer.valueOf(args[2]);

        System.out.println("Сумма вклада: " + depositSum + " грн." + "\nСтавка в год: " +
                Double.valueOf(args[1]) + " %" + "\nКол-во периодов (лет): " + years);

        monthInterest = depositSum * annualInterest / 100;
        depositSumTemp = depositSum;
        for(int i = 1; i <= years * 12; i++) {
            depositSumTemp = depositSumTemp + monthInterest;
            System.out.printf("\nНачислено за %d-й месяц: %.2f грн." +
                    "\nСумма депозита составляет:  %.2f грн.", i, monthInterest, depositSumTemp);
            if (i % 12 == 0)
                System.out.printf("\nСумма депозита с процентами за %d месяцев составляет: %.2f грн.", i, depositSumTemp);

            monthInterest = depositSumTemp * annualInterest / 100;
        }
    }
}