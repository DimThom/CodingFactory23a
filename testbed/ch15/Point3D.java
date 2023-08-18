package gr.aueb.cf.testbed.ch15;

/**
 * Αυτή η κλάση αναπαριστά ένα σημείο σε έναν τρισδιάστατο χώρο (x, y, z).
 */
public class Point3D extends Point2D {
    protected double z;

    /**
     * Δημιουργεί ένα νέο αντικείμενο Point3D με τις καθορισμένες συντεταγμένες x, y και z.
     *
     * @param x Η συντεταγμένη x του σημείου.
     * @param y Η συντεταγμένη y του σημείου.
     * @param z Η συντεταγμένη z του σημείου.
     */
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    /**
     * Υπολογίζει την απόσταση του σημείου από την αρχή των αξόνων σε έναν τρισδιάστατο χώρο.
     *
     * @return Η απόσταση του σημείου από την αρχή των αξόνων.
     */
    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}


