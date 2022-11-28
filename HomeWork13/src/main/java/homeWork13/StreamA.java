package homeWork13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamA {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(2, 3, 0, 5, 1, 4);
        System.out.println(getAverage(integerList));
    }

    public static List<Integer> createList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(0);
        integerList.add(0);
        integerList.add(0);
        integerList.add(0);
        integerList.add(0);
        return integerList;
    }
    public static Double getAverage(List<Integer> integerList) {
        List<Integer> oList = Optional.ofNullable(integerList).orElse(createList());
        return oList.stream().mapToInt(i -> i).average().getAsDouble();
    }

}
