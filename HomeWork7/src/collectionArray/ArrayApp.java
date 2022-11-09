package collectionArray;

/**
 * @author Serhii Nikonenko
 * @version 1.0.1
 */

public class ArrayApp{


    public static void main(String[] args) {

        /** default capacity = 10
         *  if you want to get other size for array - enter number in the constructor parameter or nothing */
        System.out.println("Create new array:");
        DynamicArray dynamicArray = new DynamicArray(8);
        System.out.println(dynamicArray);
        System.out.println("-------------------------------------------------------------------------------------");

        /** add value to array by index */
        System.out.println("Add few values by index:");
        System.out.println(dynamicArray.add(3, "Four"));
        System.out.println(dynamicArray.add(-4, "Five")); // incorrect index
        System.out.println(dynamicArray.add(6, "Seven"));
        System.out.println(dynamicArray.add(0, "One"));
        System.out.println(dynamicArray.add(1, "Two"));
        System.out.println(dynamicArray);
        System.out.println("-------------------------------------------------------------------------------------");

        /** add value to array */
        System.out.println("Just add some values:");
        System.out.println(dynamicArray.add("AAA"));
        System.out.println(dynamicArray.add("BBB"));
        System.out.println(dynamicArray.add("CCC"));
        System.out.println(dynamicArray.add("DDD"));
        System.out.println(dynamicArray.add("EEE"));
        System.out.println(dynamicArray);
        System.out.println("-------------------------------------------------------------------------------------");

        /** delete value by index */
        System.out.println("Delete value by index:");
        System.out.println(dynamicArray.delete(-5)); // incorrect index
        System.out.println(dynamicArray.delete(5));
        System.out.println(dynamicArray);
        System.out.println("-------------------------------------------------------------------------------------");

        /** delete by value */
        System.out.println("Add few and delete founded values:");
        System.out.println(dynamicArray.add("FFF")); // add one more value
        System.out.println(dynamicArray.add("Seven")); // add one more value
        System.out.println(dynamicArray.add("GGG")); // add one more value
        System.out.println(dynamicArray.add("BBB")); // add one more value
        System.out.println(dynamicArray.add("HHH")); // add one more value
        System.out.println("----");
        System.out.println(dynamicArray);
        System.out.println(dynamicArray.delete("BBB"));
        System.out.println(dynamicArray.delete("Seven"));
        System.out.println(dynamicArray);
        System.out.println("-------------------------------------------------------------------------------------");

        /** get value by index */
        System.out.println("Got values by index:");
        System.out.println(dynamicArray.get(2));
        System.out.println(dynamicArray.get(9));
        System.out.println(dynamicArray.get(7));
        System.out.println("-------------------------------------------------------------------------------------");

        /** move values to the left */
        System.out.println("Move values to the left");
        System.out.println("* if array has less than 3 free cell - will be added 5 free cell *");
        dynamicArray.add(10, "JJJ"); // add one more value for example
        System.out.println(dynamicArray);
        dynamicArray.moveValuesLeft();
        System.out.println(dynamicArray);
    }
}

