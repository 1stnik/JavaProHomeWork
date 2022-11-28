package homeWork13;

import java.util.List;
import java.util.Objects;

public class Pair {

    private List<String> listA;
    private List<String> listB;


    public Pair() {
    }

    public Pair(List<String> listA, List<String> listB) {
        this.listA = listA;
        this.listB = listB;
    }

    public List<String> getListA() {
        return listA;
    }

    public void setListA(List<String> listA) {
        this.listA = listA;
    }

    public List<String> getListB() {
        return listB;
    }

    public void setListB(List<String> listB) {
        this.listB = listB;
    }

    @Override
    public String toString() {
        return "Pair: " +
                "\nlistA => in:  " + listA +
                "\nlistB => out: " + listB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(listA, pair.listA) && Objects.equals(listB, pair.listB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listA, listB);
    }
}
