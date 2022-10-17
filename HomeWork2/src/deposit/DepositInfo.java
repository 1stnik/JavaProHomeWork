package deposit;

public class DepositInfo {

    private double depositSum;
    private double annualInterest;
    private int years;

    public DepositInfo(double depositSum, double annualInterest, int years) {
        this.depositSum = depositSum;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    public double getDepositSum() {
        return depositSum;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public int getYears() {
        return years;
    }

}
