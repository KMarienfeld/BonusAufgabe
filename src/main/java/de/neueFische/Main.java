package de.neueFische;

import java.util.Arrays;
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


        //System.out.println(ausgabeZahlenwort(5));
        //worterInArray();
        //printStringFromScanner();
        //printStringArrayReverse();
        //intArraySorted();
        //separateStringByComma();
        //System.out.println(calculateChecksum(45));
    }

    // Methoden für Aufg. page 1
    public static String name(String name1) {
        for (int i = 1; i < 5; ++i) {
            System.out.println(name1);
        }
        return name1;
    }

    public static boolean prüfungObGrößer0(int zahl) {
        boolean ergebnis;
        if (zahl > 0) {
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
    public static String ausgabeZahlenwort(int zahl3) {
        String[] zahlenworter = new String[10];
        zahlenworter[0] = "Eins";
        zahlenworter[1] = "Zwei";
        zahlenworter[2] = "Drei";
        zahlenworter[3] = "Vier";
        zahlenworter[4] = "Fünf";
        zahlenworter[5] = "Sechs";
        zahlenworter[6] = "Sieben";
        zahlenworter[7] = "Acht";
        zahlenworter[8] = "Neun";
        zahlenworter[9] = "Zehn";
        if (zahl3 < 10) {
            return zahlenworter[zahl3 - 1];
        } else {
            return "Zahl ist mind. zweistellig";
        }
    }


    public static String zahlenTeilbar(int zahl) {
        if (zahl % 3 == 0) {
            return "#" + zahl;
        } else if (zahl % 5 == 0) {
            return "$" + zahl;
        }
        return String.valueOf(zahl);
    }

    public static void worterInArray() {
        for (int i = 1; i < 100; ++i) {
            String[] arrayMitWort = new String[i];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Schreibe hier ein Wort rein:");
            String input = scanner.next();
            arrayMitWort[i - 1] = input;
            System.out.println(Arrays.toString(arrayMitWort));
        }
    }

    public static void printStringFromScanner() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string or type exit to exit");
        String[] inputArray = new String[0];

        while (true) {
            System.out.println(Arrays.toString(inputArray));
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            String[] copyArray = Arrays.copyOf(inputArray, inputArray.length + 1);
            copyArray[copyArray.length - 1] = input;
            inputArray = copyArray;
        }
    }

    // Methoden für Page 3:
    public static void printStringArrayReverse () {
        String[] stringArray = {"a", "b", "c", "d", "e"};
        for (int i = stringArray.length -1; i >= 0; i--) {
            System.out.println(stringArray[i]);
        }
    }

    public static void intArraySorted () {
        int[] sortArray = {6, 2, 8, 3, 9, 6};
        Arrays.sort(sortArray);
        System.out.println(Arrays.toString(sortArray));
    }

    public static void separateStringByComma() {
        String sentence = "This,is,a,string,seperated,by,commas";
        String[] sentenceArray = sentence.split(",");

        for (int i = 0; i <= sentenceArray.length -1; i++ ) {
            System.out.println(sentenceArray[i]);
        }
    }
    public static int calculateChecksum( int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}