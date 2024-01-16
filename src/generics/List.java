package generics;

public class List {

    public static void main(String[] args) {
        System.out.println("---------------------------- Aufgabe 1 ----------------------------");
        Element element1 = new Element(13, null);
        Element element2 = new Element(14, element1);
        Element element3 = new Element(15, element2);
        Element element4 = new Element(16, element3);
        Element element5 = new Element(16, element4);

        System.out.println("element1.compareTo(element2) sollte eine negative Zahl ausgeben");
        System.out.println("Ihre Ausgabe:    " + element1.compareTo(element2));
        System.out.println("\nelement5.compareTo(element4) sollte 0 ausgeben");
        System.out.println("Ihre Ausgabe:    " + element5.compareTo(element4));
        System.out.println("\nelement4.compareTo(element1) sollte eine positive Zahl ausgeben");
        System.out.println("Ihre Ausgabe:    " + element4.compareTo(element1));

        System.out.println("\n---------------------------- Aufgabe 2 ----------------------------");

        GenericElement<Integer> element6 = new GenericElement<Integer>(21, null);
        GenericElement<Integer> element7 = new GenericElement<Integer>(22, element6);
        GenericElement<Integer> element8 = new GenericElement<Integer>(23, element7);
        GenericElement<Integer> element9 = new GenericElement<Integer>(23, element8);
        GenericElement<Integer> element10 = new GenericElement<Integer>(-2, element9);

        System.out.println("element6.compareTo(element7) sollte eine negative Zahl ausgeben");
        System.out.println("Ihre Ausgabe:    " + element6.compareTo(element7));
        System.out.println("\nelement8.compareTo(element9) sollte 0 ausgeben");
        System.out.println("Ihre Ausgabe:    " + element8.compareTo(element9));
        System.out.println("\nelement7.compareTo(element10) sollte eine positive Zahl ausgeben");
        System.out.println("Ihre Ausgabe:    " + element7.compareTo(element10));
    }

}
