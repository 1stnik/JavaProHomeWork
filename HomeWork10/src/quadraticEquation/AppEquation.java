package quadraticEquation;
/**
 * @author Serhii Nikonenko
 * @version 1.0.0
 */

import java.util.Scanner;

public class AppEquation {

    public static double a;
    public static double b;
    public static double c;
    public static double d; // discriminant
    public static double x1;
    public static double x2;



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Format of quadratic equation: ax^{2}+bx+c=0");
        System.out.println("Enter value for < a > :");
        a = sc.nextDouble();
        System.out.println("Enter value for < b > :");
        b = sc.nextDouble();
        System.out.println("Enter value for < c > :");
        c = sc.nextDouble();
        sc.close();

        d = b * b - (4 * a * c);
        if (d < 0) System.out.println("Equation has no solution");
        else {
            d = Math.sqrt(d);
            x1 = (-b + d) / (2 * a);
            x2 = (-b - d) / (2 * a);
            System.out.printf("x1 = %.5f \nx2 = %.5f", x1, x2);
        }
    }
}
