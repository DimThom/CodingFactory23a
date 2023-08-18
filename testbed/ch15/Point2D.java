package gr.aueb.cf.testbed.ch15;

/**
 * Αυτή η κλάση αναπαριστά ένα σημείο σε έναν διαστατικό χώρο δύο διαστάσεων (x, y).
 */
public class Point2D extends Point {
    protected double y;

    /**
     * Δημιουργεί ένα νέο αντικείμενο Point2D με τις καθορισμένες συντεταγμένες x και y.
     *
     * @param x Η συντεταγμένη x του σημείου.
     * @param y Η συντεταγμένη y του σημείου.
     */
    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    /**
     * Υπολογίζει την απόσταση του σημείου από την αρχή των αξόνων σε έναν διαστατικό χώρο δύο διαστάσεων.
     *
     * @return Η απόσταση του σημείου από την αρχή των αξόνων.
     */
    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
}

