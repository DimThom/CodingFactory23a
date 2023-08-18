package gr.aueb.cf.testbed.ch11.main;

import gr.aueb.cf.testbed.ch11.User;
import gr.aueb.cf.testbed.ch11.UserCredentials;

/**
 * The Main class demonstrates the usage of User and
 * UserCredentials classes.
 *
 * @author dimthoma
 */
public class Main {
    public static void main(String[] args) {
        User user = new User(1L, "Dim", "Thom");
        UserCredentials credentials = new UserCredentials(1L, "DimThom", "123456");

        System.out.println("Πεδία χρήστη: {" + user.getId() + ", " + user.getFirstName() + ", " + user.getLastName() + "}");
        System.out.println("Πεδία διαπιστευτηρίων: {" + credentials.getId() + ", " + credentials.getUsername() + ", " + credentials.getPassword() + "}");
    }
}
