package hw14;

import java.util.Arrays;
import java.util.List;

public class DrawNumbers {

    public void getArray(int inNumber) {

        StringBuilder sb = new StringBuilder();
        while(inNumber > 0) {
            sb.insert(0, inNumber % 10);
            inNumber = inNumber / 10;
        }
        String inStr = sb.toString();
        List<String> stringList = Arrays.asList(inStr.split(""));
        getPixels(stringList);
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

