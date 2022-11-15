package myLinkedList;

// На основе интерфейса - реализовать коллекцию на основе связного списка.
// P.S. - в 5 разделе Связанные списки - найдете много интересного что поможет вам выполнить ДЗ.

public interface CustomCollection {

    boolean add(String str);

    boolean addAll(Collection strColl);

    boolean delete (int index);

    boolean delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();
}
