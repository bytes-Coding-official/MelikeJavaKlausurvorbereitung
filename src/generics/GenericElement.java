package generics;

// ---------------- Aufgabe 2 ----------------------
public class GenericElement<T extends Comparable<T>> implements Comparable<GenericElement<T>> {    // Die Klassendeklaration muss noch angepasst werden.

    private GenericElement<T> next;
    private T value;  // Soll generisch werden.

    public GenericElement(T value, GenericElement<T> next) {
        this.value = value;
        this.next = next;
    }

    public GenericElement getNext() {
        return next;
    }

    public void setNext(GenericElement<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public int compareTo(GenericElement<T> o) {
        //if value is equal = 0, if greater than -1 else +1
        return this.value.compareTo(o.value);
    }
}
