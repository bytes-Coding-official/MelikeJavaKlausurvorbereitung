package uebung4;

import java.util.Random;
import java.util.Scanner;

public class Lotto {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Lottospiele möchtest du spielen?");
        int anzahl = scanner.nextInt();


        int[][] lotto = new int[anzahl][6]; //generiere ein Feld der größe 6

        var random = new Random(); //erstelle ein Random Objekt mit dem man random zahlen bekommen kann


        /*
        Sorge dafür dass wir 6 lottozahlen haben
        sorge dafür dass jede lottozahl einizigartig ist 
        sorge dafür dass jede lottozahl zwischen 1 und 49 ist       
        die lottozahlen sollen sortiert abgespeichert werden 
         */


        for (int j = 0; j < lotto.length; j++) {
            for (int i = 0; i < lotto[0].length; i++) { //gehe jedes element durch
                System.out.println("Gib eine Lottozahl ein!");
                int zahl = scanner.nextInt(); //generiere eine zufällige zahl zwischen 1 und 49
                while (contains(lotto[j], zahl)) { //solange die zahl schon im lotto ist
                    System.out.println("Die Zahl ist schon im Lotto! Gib eine neue Zahl ein!");
                    zahl = scanner.nextInt(); //generiere eine zufällige zahl zwischen 1 und 49
                }
                lotto[j][i] = zahl; //speichere die zahl im lotto
            }
            System.out.println("Neues Lotto");
        }

        //sortiere das lotto
        for (int[] lottos : lotto) { //gehe jedes element durch
            sort(lottos); //sortiere das element
        }


        //gebe das lotto aus
        for (int[] lottos : lotto) { //gehe jedes element durch
            for (int element : lottos) { //gehe jedes element durch
                System.out.print(element + " "); //gebe das element aus
            }
            System.out.println(); //gebe eine neue zeile aus
        }


        int[] ergebnisse = new int[]{7, 2, 23, 6, 9, 3}; //erstelle ein feld der größe 

        //gehe jede reihe durch und schaue welcher dieser reihen die meisten zahlen hat die richtig sind 
        //gebe die reihe aus die die meisten zahlen richtig hat
        int[] zeilen = new int[6]; //erstelle ein feld der größe 6
        int maximal = 0;    //speichere die anzahl der richtigen
        //speichere das element in einer variable
        for (int[] lottos : lotto) { //gehe jedes element durch
            //erstelle ein feld der größe 6
            int[] lokale_zahlen = new int[6]; //erstelle ein feld der größe 6
            int lokales_maximal = 0; //speichere die anzahl der richtigen
            for (int element : lottos) { //gehe jedes element durch
                //prüfe ob die zahl in dem lotto auch in den ergebnissen vorkommt
                for (int i = 0; i < ergebnisse.length; i++) { //gehe jedes element durch
                    if (ergebnisse[i] == element) { //wenn die zahl in dem lotto auch in den ergebnissen vorkommt
                        lokale_zahlen[i] = element; //speichere die zahl in dem feld ab
                        lokales_maximal += 1; //erhöhe die anzahl der richtigen um 1
                    }
                }
            }
            if (lokales_maximal > maximal) { //wenn die anzahl der richtigen größer ist als die anzahl der richtigen die wir schon haben
                maximal = lokales_maximal; //speichere die anzahl der richtigen
                zeilen = lokale_zahlen; //speichere die zahlen in dem feld
            }
        }

        //In der Zeile Z1 Z2 Z3 Z4 Z5 Z6 gibt es X Richtige ersetze x mit der anzahl der richtigen und Z1 Z2 Z3 Z4 Z5 Z6 mit den zahlen die richtig sind und z1-6 mit den zahlen
        System.out.print("In der Zeile ");
        for (int element : zeilen) { //gehe jedes element durch
            System.out.print(element + " "); //gebe das element aus
        }
        System.out.print("gibt es " + maximal + " Richtige"); //gebe die anzahl der richtigen aus


    }

    private static void sort(int[] lotto) {
        for (int i = 0; i < lotto.length; i++) { //gehe jedes element durch
            for (int j = i; j < lotto.length; j++) { //gehe jedes element durch
                if (lotto[i] < lotto[j]) { //wenn die zahl an der stelle i kleiner ist als die zahl an der stelle j
                    int temp = lotto[i]; //speichere die zahl an der stelle i in einer temp variablen
                    lotto[i] = lotto[j]; //speichere die zahl an der stelle j an der stelle i
                    lotto[j] = temp; //speichere die zahl die in der temp variablen gespeichert ist an der stelle j
                }
            }
        }

    }

    private static boolean contains(int[] lotto, int zahl) {
        if (zahl > 49 || zahl < 1) { //wenn die zahl größer als 49 ist oder kleiner als 1 ist
            return true; //gebe true zurück
        }
        for (int j : lotto) { //gehe jedes element durch
            if (j == zahl) { //wenn das element gleich der zahl ist die wir suchen / die zahl kommt schon vor
                return true; //gebe true zurück
            }
        }
        return false; //gebe false zurück
    }
}
