package quadraticEquation.myArrayList;

public interface Collection<T> {

//    Реализовать простую коллекцию для String на базе массива используя интерфейс.

//    interface arrayCollection.Collection:

    boolean add(String o);

    boolean add(int index, String o);

    boolean delete (String o);

    String get(int index);

    boolean contain(String o);

    boolean equals (Collection<T> str);

    boolean clear();

    int size(); // - количество элементов которые добавили
}
