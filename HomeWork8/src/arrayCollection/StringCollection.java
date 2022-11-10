package arrayCollection;

import java.util.Arrays;


public class StringCollection implements Collection {

    private String[] arrayStr;
    private static final int DEFAULT_CAPACITY = 10;
    private int capacity;
    private int size = 0;
    private int busyCellCounter;


    public StringCollection() {
        arrayStr = new String[DEFAULT_CAPACITY];
    }

    public StringCollection(int capacity) {
        this.capacity = capacity;
        arrayStr = new String[capacity];
    } // constructors


    // ------------------------------------------------------------------------
    public String[] getArrayStr() {
        return arrayStr;
    }

    public void setArrayStr(String[] arrayStr) {
        this.arrayStr = arrayStr;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBusyCellCounter() {
        return busyCellCounter;
    }

    public void setBusyCellCounter(int busyCellCounter) {
        this.busyCellCounter = busyCellCounter;
    } // getters and setters
    // ------------------------------------------------------------------------


    public String toString() {
        final StringBuffer sb = new StringBuffer("arrayCollection.StringCollection {");
        sb.append("arrayStr = ").append(arrayStr == null ? "null" : Arrays.asList(arrayStr).toString());
        sb.append('}');
        return sb.toString();
    } // to String

    @Override
    public boolean add(String o) {
        if (o == null) return false;
        getExtendedArray();
        for (int i = 0; i < arrayStr.length; ) {
            if (arrayStr[i] != null) i++;
            else if (arrayStr[i] == null) {
                arrayStr[i] = o;
                size++;
                break;
            }
        }
        return true;
    }

    @Override
    public boolean add(int index, String o) {
        if (index < 0 || index > arrayStr.length - 1) return false;
        else if (index >= 0 && index <= (arrayStr.length - 1)) {
            addOneCell(index);
            arrayStr[index] = o;
            size++;
        }
        return true;
    }

    @Override
    public boolean delete(String o) {
        boolean found = false;
        for (int i = 0; i < arrayStr.length; i++) {
            if (o.equals(arrayStr[i])) {
                int index = i;
                deleteOneCell(index);
                size--;
                found = true;
            }
        }
        return found;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= arrayStr.length) {
            return null;
        }
        return arrayStr[index];
    }

    @Override
    public boolean contain(String o) {
        for (int i = 0; i < arrayStr.length; i++) {
            if (o.equals(arrayStr[i])) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Collection str) {
        if (this == str) return true;
        if (!(str instanceof StringCollection that)) return false;
        return Arrays.equals(getArrayStr(), that.getArrayStr());
    }

    @Override
    public boolean clear() {
        for (int i = 0; i < arrayStr.length; i++) {
            arrayStr[i] = null;
            size = 0;
        }
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }


    public int countBusyCells(String[] arrayStr) {
        busyCellCounter = 0;
        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i] != null) busyCellCounter++;
        }
        return busyCellCounter;
    }

    public String[] addOneCell(int index) {
        String[] newArray;
        newArray = new String[arrayStr.length + 1];
        System.arraycopy(arrayStr, 0, newArray, 0, arrayStr.length);
        arrayStr = new String[newArray.length];
        System.arraycopy(newArray, 0, arrayStr, 0, newArray.length);
        System.arraycopy(newArray, index, arrayStr, index + 1, arrayStr.length - (index + 1));
        countBusyCells(arrayStr);
        return arrayStr;
    }

    public String[] deleteOneCell(int index) {
        String[] newArray;
        newArray = new String[arrayStr.length];
        System.arraycopy(arrayStr, 0, newArray, 0, arrayStr.length);
        System.arraycopy(newArray, index + 1, arrayStr, index, arrayStr.length - (index + 1));
        arrayStr[arrayStr.length -1] = null;
        return arrayStr;
    }

    public String[] getExtendedArray() {
        countBusyCells(arrayStr);
        String[] newArray;
        if (busyCellCounter > (arrayStr.length - 3)) {
            newArray = new String[arrayStr.length + 5];
            System.arraycopy(arrayStr, 0, newArray, 0, arrayStr.length);
            arrayStr = new String[newArray.length];
            System.arraycopy(newArray, 0, arrayStr, 0, newArray.length);
            countBusyCells(arrayStr);
        }
        return arrayStr;
    }
}



