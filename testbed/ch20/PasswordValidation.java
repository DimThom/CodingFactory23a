package gr.aueb.cf.testbed.ch20;

import java.util.Scanner;

/**
 * Αυτή η κλάση παρέχει μια απλή επαλήθευση για τον κωδικό πρόσβασης
 * βασισμένο σε συγκεκριμένες απαιτήσεις.
 */
public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Εισαγάγετε έναν κωδικό πρόσβασης: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Ο κωδικός πρόσβασης είναι έγκυρος.");
        } else {
            System.out.println("Ο κωδικός πρόσβασης δεν είναι έγκυρος. Παρακαλώ βεβαιωθείτε ότι:");
            System.out.println("- Έχει τουλάχιστον 8 χαρακτήρες");
            System.out.println("- Περιλαμβάνει τουλάχιστον 1 μικρό γράμμα");
            System.out.println("- Περιλαμβάνει τουλάχιστον 1 κεφαλαίο γράμμα");
            System.out.println("- Περιλαμβάνει τουλάχιστον 1 αριθμό");
            System.out.println("- Περιλαμβάνει τουλάχιστον 1 ειδικό χαρακτήρα #?!@$%^&*-");
        }
    }

    /**
     * Επιβεβαιώνει αν ο κωδικός πληροί τις απαιτήσεις.
     *
     * @param password Ο κωδικός πρόσβασης προς επαλήθευση
     * @return {@code true} αν ο κωδικός είναι έγκυρος, {@code false} διαφορετικά
     */
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        if (!password.matches(".*[0-9].*")) {
            return false;
        }

        if (!password.matches(".*[#?!@$%^&*-].*")) {
            return false;
        }

        return true;
    }
}


