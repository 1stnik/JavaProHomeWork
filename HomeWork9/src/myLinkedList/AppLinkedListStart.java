package myLinkedList;

/**
 * @author Serhii Nikonenko
 * @version 1.0.0
 */

public class AppLinkedListStart {

    public static void main(String[] args) {

        Collection strColl = new Collection();

        System.out.println("Is that collection empty? - " + strColl.isEmpty());
        System.out.println("----------------------------------");

        System.out.println("Add element: " + strColl.add("CCC"));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println("Add element: " + strColl.add("EEE"));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println("Add element: " + strColl.add("KKK"));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println("Add element: " + strColl.add("BBB"));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println("Add element: " + strColl.add("FFF"));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println("Add element: " + strColl.add("AAA"));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println("Add element: " + strColl.add("DDD"));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println("Delete element: " + strColl.delete("KKK"));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println("Delete element by index " + ": " + strColl.delete(2));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println("Add all values from collection: " + strColl.addAll(strColl));
        strColl.showCollection();
        System.out.println("\nSize value: " + strColl.getSize());
        System.out.println("----------------------------------");

        System.out.println(strColl.get(3));
        System.out.println(strColl.get(0));
        System.out.println("----------------------------------");

        System.out.println(strColl.contains("CCC"));
        System.out.println("----------------------------------");

        System.out.println("Is that collection empty? - " + strColl.isEmpty());
        System.out.println("Collection size = " + strColl.size());
        System.out.println("----------------------------------");

        System.out.println("Clear the collection: " + strColl.clear());
        System.out.println("Collection size = " + strColl.size());
        strColl.showCollection();

    }
}
