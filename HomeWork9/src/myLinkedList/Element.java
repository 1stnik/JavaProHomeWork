package myLinkedList;

public class Element {

    private String str;
    private Element nextEl;

    // ------------------------------------------------
    public Element() {
    }

    public Element(String str) {
        this.str = str;
    }
    // ------------------------------------------------

    public Element getNextEl() {
        return nextEl;
    }

    public void setNextEl(Element nextEl) {
        this.nextEl = nextEl;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    // ------------------------------------------------

    public void showElement() {
        System.out.print("{" + str + "} ");
    }

}
