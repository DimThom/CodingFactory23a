package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ενα αεροσκάφος έχει δυο δεξαμενές.
 * Αν μια δεξαμενή έχει λιγότερο απο
 * 1/4 καύσιμα τότε ανάβει πορτοκαλί
 * σήμα, ενω αν και οι δυο δεξαμενές
 * έχουν < 1/4 τότε ανάβει κόκκινο σήμα
 * Ο πιλότος (χρήστης) δίνει true ή false
 * ανάλογα αν tank <1/4 ή οχι αντίστοιχα
 */
public class OrangeRedSingalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if tan1, tank2 are less than 1/4");
        isTank1LTQuarter = in.hasNextBoolean();
        isTank2LTQuarter = in.hasNextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuarter;
        redOn = isTank1LTQuarter && isTank2LTQuarter;

        System.out.println("Orange on: " + orangeOn);
        System.out.println("Red On: " + redOn);


    }
}
