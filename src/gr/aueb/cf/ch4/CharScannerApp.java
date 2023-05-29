package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει ενα Char με την
 * Scanner
 */
public class CharScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar;

        System.out.println("PLease insert a char");
        inputChar = in.next().charAt(0);

        System.out.println("Char: " + inputChar);
    }
}
