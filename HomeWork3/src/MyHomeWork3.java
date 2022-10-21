import java.util.Scanner;

public class MyHomeWork3 {

    public static void main(String[] args) {

        // 1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
        System.out.println("Task 1:");
        for (int i = 1; i <= 99; i++) System.out.print(i + " ");

        // 2. Дано число n при помощи цикла for посчитать факториал n!
        System.out.println("\n-----------------------------------\nTask 2:");
        int factOfNum = 1;
        int num = 8;   // Вычисление факториала для числа <num>
        for (int i = 1; i <= num; i++) {
            factOfNum = factOfNum * i;
            System.out.print(factOfNum + "  ");
        }

        // 3. Перепишите программы с использованием цикла while.
        System.out.println("\n-----------------------------------\nTask 3:");
        int i = 1;
        while (i <= 99) {
            System.out.print(i + " ");
            i++;
        }

        System.out.print("\n");
        factOfNum = 1;
        i = 1;
        while (i <= num) {
            factOfNum = factOfNum * i;
            i++;
            System.out.print(factOfNum + "  ");
        }

        // 4. Перепишите программы с использованием цикла do - while.
        System.out.println("\n-----------------------------------\nTask 4:");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 99);

        System.out.print("\n");
        factOfNum = 1;
        i = 1;
        do {
            factOfNum = factOfNum * i;
            System.out.print(factOfNum + "  ");
            i++;
        } while (i <= num);

        // 5. Даны переменные x и n вычислить x^n.
        System.out.println("\n-----------------------------------\nTask 5:");
        int x = 3;
        int n = 5;
        int pow = 1;
        for (i = 0; i < n; i++) {
            pow = pow * x;
        }
        System.out.println("x^n = " + pow);

        // 6. Вывести 10 первых чисел последовательности 0, -5,-10,-15.
        System.out.println("-----------------------------------\nTask 6:");
        i = 0;
        num = 0;
        while (i < 10) {
            System.out.print(num + " ");
            i++;
            num -= 5;
        }

//         7. Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)
        System.out.println("\n-----------------------------------\nTask 7:");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter any number");
        double d = scnr.nextDouble();
        i = 1;
        while (i <= 10) {
            double result = i * d;
            System.out.println(i + " * " + d + " = " + result);
            i++;
        }

        // 8. Создайте массив, содержащий 10 первых нечетных чисел.
        //    Выведете элементы массива на консоль в одну строку, разделяя запятой.
        System.out.println("-----------------------------------\nTask 8:");
        int[] oddDigits = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int o : oddDigits) System.out.print(o + ", ");

        System.out.println("\n...and one more version:");
        int[] arrInt = new int[10];
        int counter = 1;
        int arrCounter = 0;
        while (arrCounter < arrInt.length) {
            if (counter % 2 != 0) {
                arrInt[arrCounter] = counter;
                System.out.print(arrInt[arrCounter] + ", ");
                arrCounter++;
            }
            counter++;
        }

        // 9. Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
        //    (если наименьших элементов несколько — вывести их все).
        System.out.println("\n-----------------------------------\nTask 9:");
        int[] arrayForTask = new int[]{3, 2, -4, 5, 9, -1, -4, 6, 8, 2, 9, -4, 1};
        int minValue = arrayForTask[0];
        System.out.print("Min value: ");
        for (int a = 1; a < arrayForTask.length; a++) {
            if (minValue > arrayForTask[a]) {
                minValue = arrayForTask[a];
            } else if (minValue == arrayForTask[a]) System.out.print(minValue + " ");
        }
        System.out.println(minValue + " ");

        // 10. В массиве из задания 9. найти наибольший элемент.
        System.out.println("-----------------------------------\nTask 10:");
        int maxValue = arrayForTask[0];
        System.out.print("Max value: ");
        for (int a = 1; a < arrayForTask.length; a++) {
            if (maxValue < arrayForTask[a]) {
                maxValue = arrayForTask[a];
            } else if (maxValue == arrayForTask[a]) System.out.print(maxValue + " ");
        }
        System.out.print(maxValue + " ");




}
}
