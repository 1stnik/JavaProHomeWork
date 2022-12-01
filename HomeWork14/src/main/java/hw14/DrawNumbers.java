package hw14;

import java.util.Arrays;
import java.util.List;

public class DrawNumbers {

    public void getArray(String number) {
        List<String> stringList = Arrays.stream(number.split("")).toList();
        try {
            stringList.stream().map(Integer::parseInt).toList();
            getPixels(stringList);
        } catch (NumberFormatException e) {
            System.out.println("It's not a number!");
        }
    }


    public void getPixels(List<String> stringList) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < stringList.size(); j++) {
                switch (stringList.get(j)) {
                    case "0" -> System.out.print(MyApp.zero.get(i));
                    case "1" -> System.out.print(MyApp.one.get(i));
                    case "2" -> System.out.print(MyApp.two.get(i));
                    case "3" -> System.out.print(MyApp.three.get(i));
                    case "4" -> System.out.print(MyApp.four.get(i));
                    case "5" -> System.out.print(MyApp.five.get(i));
                    case "6" -> System.out.print(MyApp.six.get(i));
                    case "7" -> System.out.print(MyApp.seven.get(i));
                    case "8" -> System.out.print(MyApp.eight.get(i));
                    case "9" -> System.out.print(MyApp.nine.get(i));
                }
            }
            System.out.print("\n");
        }
    }
}

