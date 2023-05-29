package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης έχει δέκα ευκαιρίες να
 * βρει ένα μυστικό κλειδί (int). Αν το βρει
 * νωρίτερα απο τη 10η φορά, η for θα πρέπει
 * να σταματήσει (break)
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Please make a guess");
            num = in.nextInt();

            if (num == SECRET_KEY) {
                System.out.println("Success! PLay again!");
                found = true;
                break;
            }

            if (!found) {
                System.out.println("No worries, play again");
                System.exit(1);
            }

        }
    }
}
