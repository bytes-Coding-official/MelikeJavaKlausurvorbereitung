package generics;

// ---------------- Aufgabe 1 ----------------------
public class Element implements Comparable<Element> {   // Das Interface Comparable soll implementiert werden

    private Element next;
    private int value;

    public Element(int value, Element next) {
        this.value = value;
        this.next = next;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Element o) {
        //if value is equal = 0, if greater than -1 else +1
        if (this.value == o.value) {
            return 0;
        } else if (this.value > o.value) {
            return 1;
        } else {
            return -1;
        }
    }
}
