package de.neueFische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Page 1
        System.out.println(name("Anna"));
        System.out.println(prüfungObGrößer0(20));
        System.out.println(quadratBerechnen(8));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Schreibe hier deinen Namen rein:");
        String input = scanner.nextLine();

        System.out.println("Hallo "+ input); */


    }

    // Methoden für Aufg. page 1
    public static String name(String name1) {
        for( int i = 1; i < 5; ++i) {
            System.out.println(name1);
        }
        return name1;
    }

    public static boolean prüfungObGrößer0(int zahl) {
        boolean ergebnis;
        if(zahl>0) {
            ergebnis = true;
        } else {
            ergebnis = false;
        }
        return ergebnis;
    }

    public static int quadratBerechnen(int zahl2) {
            return (zahl2 * zahl2);
    }

    // Methoden für Aufg. page 2

}