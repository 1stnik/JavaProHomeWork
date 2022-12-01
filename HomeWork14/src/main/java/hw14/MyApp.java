package hw14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Serhii Nikonenko
 * @version 1.0.1
 */

public class MyApp {

    protected static List<String> zero;
    protected static List<String> one;
    protected static List<String> two;
    protected static List<String> three;
    protected static List<String> four;
    protected static List<String> five;
    protected static List<String> six;
    protected static List<String> seven;
    protected static List<String> eight;
    protected static List<String> nine;


    public static void main(String[] args) {

        setNumbersValues();
        DrawNumbers drawNumbers = new DrawNumbers();
        drawNumbers.getArray(getNumber());
    }

    protected static String getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String number = null;
        if (!sc.hasNextLine()) {
            System.out.print("It's not a number! Try again!");
            sc.close();
        } else {
            number = sc.nextLine();
            sc.close();
        }
        return number;
    }

    protected static void setNumbersValues() {

        zero = new ArrayList<>();
        zero.add(0, "   @@ ");
        zero.add(1, "  @  @");
        zero.add(2, "  @  @");
        zero.add(3, "  @  @");
        zero.add(4, "  @  @");
        zero.add(5, "  @  @");
        zero.add(6, "   @@ ");

        one = new ArrayList<>();
        one.add(0, "    @ ");
        one.add(1, "   @@ ");
        one.add(2, "    @ ");
        one.add(3, "    @ ");
        one.add(4, "    @ ");
        one.add(5, "    @ ");
        one.add(6, "   @@@");

        two = new ArrayList<>();
        two.add(0, "   @@ ");
        two.add(1, "  @  @");
        two.add(2, "  @  @");
        two.add(3, "     @");
        two.add(4, "    @ ");
        two.add(5, "   @  ");
        two.add(6, "  @@@@");

        three = new ArrayList<>();
        three.add(0, "   @@ ");
        three.add(1, "  @  @");
        three.add(2, "     @");
        three.add(3, "    @ ");
        three.add(4, "     @");
        three.add(5, "  @  @");
        three.add(6, "   @@ ");

        four = new ArrayList<>();
        four.add(0, "  @  @");
        four.add(1, "  @  @");
        four.add(2, "  @  @");
        four.add(3, "  @@@@");
        four.add(4, "     @");
        four.add(5, "     @");
        four.add(6, "     @");

        five = new ArrayList<>();
        five.add(0, "  @@@@");
        five.add(1, "  @   ");
        five.add(2, "  @@@ ");
        five.add(3, "     @");
        five.add(4, "     @");
        five.add(5, "  @  @");
        five.add(6, "   @@ ");

        six = new ArrayList<>();
        six.add(0, "   @@ ");
        six.add(1, "  @  @");
        six.add(2, "  @   ");
        six.add(3, "  @@@ ");
        six.add(4, "  @  @");
        six.add(5, "  @  @");
        six.add(6, "   @@ ");

        seven = new ArrayList<>();
        seven.add(0, "  @@@@");
        seven.add(1, "     @");
        seven.add(2, "     @");
        seven.add(3, "    @ ");
        seven.add(4, "   @  ");
        seven.add(5, "   @  ");
        seven.add(6, "   @  ");

        eight = new ArrayList<>();
        eight.add(0, "   @@ ");
        eight.add(1, "  @  @");
        eight.add(2, "  @  @");
        eight.add(3, "   @@ ");
        eight.add(4, "  @  @");
        eight.add(5, "  @  @");
        eight.add(6, "   @@ ");

        nine = new ArrayList<>();
        nine.add(0, "   @@ ");
        nine.add(1, "  @  @");
        nine.add(2, "  @  @");
        nine.add(3, "   @@@");
        nine.add(4, "     @");
        nine.add(5, "  @  @");
        nine.add(6, "   @@ ");

    }
}
