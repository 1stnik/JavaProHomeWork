package quadraticEquation.myArrayList;

/**
 * @author Serhii Nikonenko
 * @version 1.0.0
 */

import java.util.HashSet;


public class AppStart {

    public static void main(String[] args) {

        StringCollection stringCollection = new StringCollection(6);

        System.out.println(stringCollection);
        System.out.println("----------------------------------------------------");

        System.out.println("boolean add(String o)");
        System.out.println(stringCollection.add("DDD"));
        System.out.println(stringCollection.add("BBB"));
        System.out.println(stringCollection);
        System.out.println("----------------------------------------------------");

        System.out.println("boolean add(int index, String o)");
        System.out.println(stringCollection.add(1, "EEE"));
        System.out.println(stringCollection.add(5, "BBB"));
        System.out.println(stringCollection);
        System.out.println("----------------------------------------------------");

        System.out.println("boolean delete (String o)");
        System.out.println(stringCollection.delete("CCC")); // there is no "CCC"
        System.out.println(stringCollection.delete("BBB"));
        System.out.println(stringCollection);
        System.out.println("----------------------------------------------------");

        System.out.println("String get(int index)");
        System.out.println(stringCollection.get(1));
        System.out.println(stringCollection.get(0));
        System.out.println("----------------------------------------------------");

        System.out.println("boolean contain(String o)");
        System.out.println(stringCollection.contain("EEE"));
        System.out.println(stringCollection.contain("CCC")); // there is no "CCC"
        System.out.println("----------------------------------------------------");

        System.out.println("boolean equals (arrayCollection.Collection str)");
        StringCollection stringCollection1 = new StringCollection(8);
        System.out.println(stringCollection);
        System.out.println(stringCollection1);
        System.out.println(stringCollection1.add("DDD"));
        System.out.println(stringCollection1);
        System.out.println(stringCollection.equals(stringCollection1));
        System.out.println(stringCollection1.add("EEE"));
        System.out.println(stringCollection1);
        System.out.println(stringCollection.equals(stringCollection1));
        System.out.println("----------------------------------------------------");

        System.out.println("boolean clear()");
        System.out.println(stringCollection.clear());
        System.out.println(stringCollection);
        System.out.println("----------------------------------------------------");

        System.out.println("int size()");
        System.out.println(stringCollection.size());
        System.out.println(stringCollection1.size());

        System.out.println(stringCollection);
        System.out.println("----------------------------------------------------");

        System.out.println("boolean add(String o)");
        System.out.println(stringCollection.add("DDD"));
        System.out.println(stringCollection.add("BBB"));
        System.out.println(stringCollection.add("EEE"));
        System.out.println(stringCollection.add("BBB"));
        System.out.println(stringCollection.add("DDD"));
        System.out.println(stringCollection.add("EEE"));
        System.out.println(stringCollection.add("AAA"));
        System.out.println(stringCollection);
        System.out.println("----------------------------------------------------");


        System.out.println(removeDuplicates(stringCollection));
        System.out.println("----------------------------------------------------");

        System.out.print("With iterator: ");
        while (stringCollection.hasNext()) {
            System.out.println(stringCollection.next());
        }
        System.out.println(stringCollection);

    }

    public static HashSet removeDuplicates(StringCollection stringCollection) {
        HashSet<String> hashColl = new HashSet<>();
        for (int i = 0; i < stringCollection.getArrayStr().length; i++) {
            if (stringCollection.get(i) != null) hashColl.add(stringCollection.get(i));
        }
        return hashColl;
    }
}
