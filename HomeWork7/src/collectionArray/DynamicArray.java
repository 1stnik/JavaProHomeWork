package collectionArray;


import java.util.Arrays;

public class DynamicArray implements DynamicArrayService {

    private String[] arrayStr;
    private int capacity;
    private int freeCellCounter;


    public DynamicArray() {
        capacity = 10;
        arrayStr = new String[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        arrayStr = new String[capacity];
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DynamicArray {");
        sb.append("arrayStr = ").append(arrayStr == null ? "null" : Arrays.asList(arrayStr).toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean add(int index, String value) {
        if (index < 0 || index > arrayStr.length - 1) return false;
        else if (index >= 0 && index <= (arrayStr.length - 1)) {
            arrayStr[index] = value;
        }
        return true;
    }

    @Override
    public boolean add(String value) {
        if (value.isEmpty()) return false;
        getExtendedArray();
        for (int i = 0; i < arrayStr.length; ) {
            if (arrayStr[i] != null) i++;
            else if (arrayStr[i] == null) {
                arrayStr[i] = value;
                break;
            }
        }
        return true;
    }

    public int countFreeCells(String[] array) {
        freeCellCounter = 0;
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] == null) freeCellCounter++;
        }
        return freeCellCounter;
    }

    public String[] getExtendedArray() {
        countFreeCells(arrayStr);
        String[] newArray;
        if (freeCellCounter < 3) {
            newArray = new String[arrayStr.length + 5];
            System.arraycopy(arrayStr, 0, newArray, 0, arrayStr.length);
            arrayStr = new String[newArray.length];
            System.arraycopy(newArray, 0, arrayStr, 0, newArray.length);
            countFreeCells(arrayStr);
        }
        return arrayStr;
    }

    @Override
    public boolean delete(int index) {
        if (index < 0 || index > arrayStr.length - 1) return false;
        else if (index >= 0 && index <= (arrayStr.length - 1)) {
            arrayStr[index] = null;
        }
        return true;
    }

    @Override
    public boolean delete(String value) {
        boolean found = false;
        for (int i = 0; i < arrayStr.length; i++) {
            if (value.equals(arrayStr[i])) {
                arrayStr[i] = null;
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

    public void moveValuesLeft() {
        String[] newArray = new String[arrayStr.length];
        System.arraycopy(arrayStr, 0, newArray, 0, arrayStr.length);
        arrayStr = new String[newArray.length - countFreeCells(newArray)];
        for (int j = 0; j < newArray.length; j++) {
            if (newArray[j] != null) {
                add(newArray[j]);
            }
        }
    }
}
