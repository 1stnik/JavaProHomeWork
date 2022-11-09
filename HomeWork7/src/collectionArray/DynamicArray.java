package collectionArray;


import java.util.Arrays;

public class DynamicArray implements DynamicArrayService {

    private String[] arrayStr;
    private int capacity;
    private int busyCellCounter;


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
            addOneCell(index);
            arrayStr[index] = value;
        }
        return true;
    }

    @Override
    public boolean add(String value) {
        if (value == null) return false;
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

    @Override
    public boolean delete(int index) {
        if (index < 0 || index > arrayStr.length - 1) return false;
        else if (index >= 0 && index <= (arrayStr.length - 1)) {
//            arrayStr[index] = null;
            deleteOneCell(index);
        }
        return true;
    }

    @Override
    public boolean delete(String value) {
        boolean found = false;
        for (int i = 0; i < arrayStr.length; i++) {
            if (value.equals(arrayStr[i])) {
                int index = i;
                deleteOneCell(index);
                found = true;
            }
        }
        return found;
    }

    public String[] deleteOneCell(int index) {
        String[] newArray;
        newArray = new String[arrayStr.length];
        System.arraycopy(arrayStr, 0, newArray, 0, arrayStr.length);
        System.arraycopy(newArray, index + 1, arrayStr, index, arrayStr.length - (index + 1));
        arrayStr[arrayStr.length -1] = null;
        return arrayStr;
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
        arrayStr = new String[newArray.length - (newArray.length - countBusyCells(newArray))];
        for (int j = 0; j < newArray.length; j++) {
            if (newArray[j] != null) {
                add(newArray[j]);
            }
        }
    }
}
