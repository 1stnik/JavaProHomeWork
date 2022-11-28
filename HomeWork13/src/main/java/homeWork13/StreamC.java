package homeWork13;

import java.util.List;
import java.util.function.Predicate;


public class StreamC {

    public static void main(String[] args) {

        List<String> textList = List.of("pancake", "Roe", "deer", "jogged", "Brighten", "up", "folk",
                "Crustaceans", "Preschooler", "theorem", "Funeral", "Polo", "Remake", "Ermine", "Oil", "pipeline",
                "Accounting", "Wiping", "to", "push", "Diuretic", "drop", "Road");
        System.out.println(getLowerCaseString(textList));
    }

    public static List<String> getLowerCaseString(List<String> textList) {
        int wordLength = 4;
        Predicate<String> lowerCaseWord = s -> s.equals(s.toLowerCase());
        Predicate<String> letterLimit = s -> s.length() == wordLength;
        List<String> resultText = textList.stream().filter(letterLimit.and(lowerCaseWord)).toList();
        return resultText;
    }
}
