package gr.aueb.cf.testbed.ch15;

/**
 * Αυτή η κλάση παρέχει χρήσιμες μεθόδους για τον υπολογισμό αποστάσεων μεταξύ σημείων.
 */
public class PointUtil {

    /**
     * Υπολογίζει την απόσταση ενός σημείου από την αρχή των αξόνων (σημείο προέλευσης).
     *
     * @param point Το σημείο για το οποίο θα υπολογιστεί η απόσταση.
     * @return Η απόσταση του σημείου από την αρχή των αξόνων.
     */
    public static double distanceFromOrigin(Point point) {
        return point.getDistanceFromOrigin();
    }
}


