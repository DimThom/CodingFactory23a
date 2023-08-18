package gr.aueb.cf.testbed.ch15;

/**
 * Αυτή η κλάση αναπαριστά ένα σημείο σε έναν διαστατικό χώρο με την συντεταγμένη x.
 */
public class Point {
    protected double x;

    /**
     * Δημιουργεί ένα νέο αντικείμενο Point με την καθορισμένη συντεταγμένη x.
     *
     * @param x Η συντεταγμένη x του σημείου.
     */
    public Point(double x) {
        this.x = x;
    }

    /**
     * Υπολογίζει την απόσταση του σημείου από την αρχή των αξόνων (σημείο προέλευσης).
     *
     * @return Η απόσταση του σημείου από την αρχή των αξόνων.
     */
    public double getDistanceFromOrigin() {
        return Math.abs(x - 0);
    }
}


