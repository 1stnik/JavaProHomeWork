package homeWork13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamB {

    public static void main(String[] args) {
        List<String> sourceList = List.of("one", "two", "three","four", "five", "six", "seven", "eight", "nine", "ten");
        System.out.println(getListPair(sourceList));
    }

    public static List<String> createNewList() {
        List<String> sourceList = new ArrayList<>();
        sourceList.add("-");
        sourceList.add("-");
        sourceList.add("-");
        sourceList.add("-");
        sourceList.add("-");
        sourceList.add("-");
        return sourceList;
    }

    public static List<Pair> getListPair(List<String> sourceList) {
        Pair pair = new Pair();
        List<String> opList = Optional.ofNullable(sourceList).orElse(createNewList());
        pair.setListA(opList);
        pair.setListB(pair.getListA().stream().map(s -> "{" + s + ":" + s.toUpperCase() + "}")
                .collect(Collectors.toList()));
        List<Pair> pList = new ArrayList<>();
        pList.add(pair);
        return pList;
    }

}
