package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει εάν χιονίζει με βάση τη θερμοκρασία
 * αν η θερμοκρασία είναι < 0 τότε χιονίζει αλλιώς
 * δε χιονίζει. Ο χρήστης δίνει τη θερμοκρασία
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean inSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        inSnowing = (temp < 0);

        System.out.println("Is snowing: " + inSnowing);

    }
}
