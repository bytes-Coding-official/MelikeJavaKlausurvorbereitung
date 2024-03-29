package miniprojekt1;

import java.util.Arrays;

/**
 * Control flow.
 *
 * @author Marcus
 */
public class Aufgabe1 {

    /**
     * Returns true if number is 1, 2 or 3.
     *
     * @param number The number to test.
     * @return True if number is 1, 2 or 3. False otherwise.
     */
    public static boolean decideWithIfOneTwoOrThree(int number) {
        // TODO: implement me!
        return false;
    }

    /**
     * Returns true if number is 1, 2 or 3.
     *
     * @param number The number to test.
     * @return True if number is 1, 2 or 3. False otherwise.
     */
    public static boolean decideWithCaseOneTwoOrThree(int number) {
        // TODO: implement me!
        return false;
    }

    /**
     * Returns true if number is 1, 2 or 3.
     *
     * @param number The number to test.
     * @return True if number is 1, 2 or 3. False otherwise.
     */
    public static boolean decideWithoutCaseOrIfOneTwoOrThree(int number) {
        // TODO: implement me!
        return false;
    }

    /**
     * Fills the array with the indexes using a for loop.
     *
     * @param array The array to fill.
     */
    public static void fillArrayIndexWithFor(int[] array) {
        // TODO: implement me!
    }

    /**
     * Fills the array with the indexes using a while loop.
     *
     * @param array The array to fill.
     */
    public static void fillArrayIndexWithWhile(int[] array) {
        // TODO: implement me!
    }


    /**
     * Fills the array with the reverse indexes using a for loop.
     *
     * @param array The array to fill.
     */
    public static void fillArrayReverseIndexWithFor(int[] array) {
        // TODO: implement me!
    }

    /**
     * Fills the array with the reverse indexes using a while loop.
     *
     * @param array The array to fill.
     */
    public static void fillArrayReverseIndexWithWhile(int[] array) {
        // TODO: implement me!
    }

    /**
     * Fills the array with the indexes using a for loop.
     *
     * @param array The array to fill.
     */
    public static int computeArraySumWithFor(int[] array) {
        // TODO: implement me!
        return 0;
    }

    /**
     * Fills the array with the indexes using a while loop.
     *
     * @param array The array to fill.
     */
    public static int computeArraySumWithWhile(int[] array) {
        // TODO: implement me!
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Aufgabe 1.1 (decideWithIfOneTwoOrThree)");
        System.out.println("-----");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Eingabewert: " + i + "\tIhre Ausgabe: " + decideWithIfOneTwoOrThree(i));
        }
        System.out.println();

        System.out.println("Aufgabe 1.2 (decideWithCaseOneTwoOrThree)");
        System.out.println("-----");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Eingabewert: " + i + "\tIhre Ausgabe: " + decideWithCaseOneTwoOrThree(i));
        }
        System.out.println();

        System.out.println("Aufgabe 1.3 (decideWithoutCaseOrIfOneTwoOrThree)");
        System.out.println("-----");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Eingabewert: " + i + "\tIhre Ausgabe: " + decideWithoutCaseOrIfOneTwoOrThree(i));
        }
        System.out.println();

        System.out.println("Aufgabe 1.4 (fillArrayIndexWithFor)");
        System.out.println("-----");
        int[] array = new int[]{7, 5, 1};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        fillArrayIndexWithFor(array);
        System.out.println("Ihre Ausgabe: " + Arrays.toString(array));
        array = new int[]{23, 8, -14, 13, 7};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        fillArrayIndexWithFor(array);
        System.out.println("Ihre Ausgabe: " + Arrays.toString(array));
        System.out.println();

        System.out.println("Aufgabe 1.5 (fillArrayIndexWithWhile)");
        System.out.println("-----");
        array = new int[]{7, 5, 1};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        fillArrayIndexWithWhile(array);
        System.out.println("Ihre Ausgabe: " + Arrays.toString(array));
        array = new int[]{23, 8, -14, 13, 7};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        fillArrayIndexWithWhile(array);
        System.out.println("Ihre Ausgabe: " + Arrays.toString(array));
        System.out.println();

        System.out.println("Aufgabe 1.6 (fillArrayReverseIndexWithFor)");
        System.out.println("-----");
        array = new int[]{7, 5, 1};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        fillArrayReverseIndexWithFor(array);
        System.out.println("Ihre Ausgabe: " + Arrays.toString(array));
        array = new int[]{23, 8, -14, 13, 7};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        fillArrayReverseIndexWithFor(array);
        System.out.println("Ihre Ausgabe: " + Arrays.toString(array));
        System.out.println();

        System.out.println("Aufgabe 1.7 (fillArrayReverseIndexWithWhile)");
        System.out.println("-----");
        array = new int[]{7, 5, 1};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        fillArrayReverseIndexWithWhile(array);
        System.out.println("Ihre Ausgabe: " + Arrays.toString(array));
        array = new int[]{23, 8, -14, 13, 7};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        fillArrayReverseIndexWithWhile(array);
        System.out.println("Ihre Ausgabe: " + Arrays.toString(array));
        System.out.println();

        System.out.println("Aufgabe 1.8 (computeArraySumWithFor)");
        System.out.println("-----");
        array = new int[]{7, 5, 1};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        System.out.println("Ihre Summe: " + computeArraySumWithFor(array));
        array = new int[]{11, 3, -14, 8, 7};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        System.out.println("Ihre Summe: " + computeArraySumWithFor(array));
        System.out.println();

        System.out.println("Aufgabe 1.9 (computeArraySumWithWhile)");
        System.out.println("-----");
        array = new int[]{7, 5, 1};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        System.out.println("Ihre Summe: " + computeArraySumWithWhile(array));
        array = new int[]{11, 3, -14, 8, 7};
        System.out.println("Eingabearray: " + Arrays.toString(array));
        System.out.println("Ihre Summe: " + computeArraySumWithWhile(array));
        System.out.println();
    }
}
