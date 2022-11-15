package myLinkedList;


public class Collection implements CustomCollection {

    private Element firstEl;
    private int size = 0;

    // -------------------------------------------------------------------
    public Collection() {
        this.firstEl = null;
    }
    // -------------------------------------------------------------------

    public Element getFirstEl() {
        return firstEl;
    }

    public void setFirstEl(Element firstEl) {
        this.firstEl = firstEl;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    // -------------------------------------------------------------------

    public boolean isEmpty() {
        return (firstEl == null);
    }


    public void showCollection() {
        if (firstEl == null) System.out.println("Collection is empty!");
        else {
            System.out.print("Collection: ");
            Element currentEl = firstEl;
            while (currentEl != null) {
                currentEl.showElement();
                currentEl = currentEl.getNextEl();
            }
        }
    }

    @Override
    public boolean add(String str) {
        if (str == null) return false;
        else {
            Element newEl = new Element(str);
            newEl.setNextEl(firstEl);
            firstEl = newEl;
            size++;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection strColl) {
        Element currentEl = strColl.firstEl;
        add(currentEl.getStr());
        while (currentEl.getNextEl() != null) {
            add(currentEl.getNextEl().getStr());
            currentEl = currentEl.getNextEl();
        }
       return true;
    }

    @Override
    public boolean delete(int index) {
        Element current = firstEl;
        int i = 0;
        while (i != index) {
            current = current.getNextEl();
            i++;
        }
        delete(current.getStr());
        return true;
    }

    @Override
    public boolean delete(String str) {
        Element previousEl = firstEl;
        Element currentEl = firstEl;
        while (!currentEl.getStr().equals(str)) {
            if (currentEl.getStr() == null) return false;
            else {
                previousEl = currentEl;
                currentEl = currentEl.getNextEl();
            }
        }
        if (currentEl == firstEl) {
            firstEl = firstEl.getNextEl();
        } else previousEl.setNextEl(currentEl.getNextEl());
        size--;
        return true;
    }


    @Override
    public String get(int index) {
        Element currentEl = firstEl;
        int i = 0;
        while (i != index) {
            currentEl = currentEl.getNextEl();
            i++;
        }
        String value = "Value of element by index < " + i + " > => " + currentEl.getStr();
        return value;
    }

    @Override
    public boolean contains(String str) {
        Element currentEl = firstEl;
        while (currentEl.getNextEl() != null) {
            currentEl = currentEl.getNextEl();
            if (currentEl.getStr().equals(str)) {
                System.out.println("Does this collection contain a value < " + str + " > ?");
                return true;
            }
        }
        System.out.println("No such value in the collection!");
        return false;
    }

    @Override
    public boolean clear() {
        firstEl.setNextEl(null);
        firstEl = null;
        size = 0;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean trim() {
        return false;
    }
}
