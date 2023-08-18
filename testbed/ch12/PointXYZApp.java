package gr.aueb.cf.testbed.ch12;

/**
 * Αυτή η κλάση δείχνει τη χρήση της κλάσης PointXYZ, δημιουργώντας ένα 3D σημείο,
 * ενημερώνοντας τις συντεταγμένες του και εμφανίζοντας τα αποτελέσματα.
 */
public class PointXYZApp {
    public static void main(String[] args) {
        // Δημιουργία ενός νέου αντικειμένου PointXYZ με αρχικές συντεταγμένες (1.0, 2.0, 3.0).
        PointXYZ point = new PointXYZ(1.0, 2.0, 3.0);

        // Εμφάνιση των αρχικών συντεταγμένων του σημείου.
        System.out.println("Συντεταγμένες: " + point.convertToString());

        // Ενημέρωση των συντεταγμένων του σημείου χρησιμοποιώντας τις μεθόδους setX(), setY() και setZ().
        point.setX(4.0);
        point.setY(5.0);
        point.setZ(6.0);

        // Εμφάνιση των νέων συντεταγμένων του σημείου.
        System.out.println("Νέες συντεταγμένες: " + point.convertToString());
    }
}


