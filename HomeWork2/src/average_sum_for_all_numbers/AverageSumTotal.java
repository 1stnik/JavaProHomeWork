package average_sum_for_all_numbers;

public class AverageSumTotal {

    static int[] numbers;
    static double average;
    static int sum;
    static int n; //quantity of numbers

    public static void main(String[] args) {

        n = 5;
        numbers = new int[n];
        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 11;
        numbers[3] = 9;
        numbers[4] = 4;

        for (int num : numbers) {
            sum += num;
        }
        average = (double) sum / n;
        System.out.println(average);

    }
}
