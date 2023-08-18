package gr.aueb.cf.testbed.ch12;

/**
 * Αναπαριστά ένα 3D σημείο με συντεταγμένες x, y και z.
 */
public class PointXYZ {
    private double x;
    private double y;
    private double z;

    /**
     * Κατασκευάζει ένα νέο αντικείμενο PointXYZ με τις καθορισμένες συντεταγμένες.
     *
     * @param x Η x-συντεταγμένη του σημείου.
     * @param y Η y-συντεταγμένη του σημείου.
     * @param z Η z-συντεταγμένη του σημείου.
     */
    public PointXYZ(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Επιστρέφει την x-συντεταγμένη του σημείου.
     *
     * @return Η x-συντεταγμένη του σημείου.
     */
    public double getX() {
        return x;
    }

    /**
     * Επιστρέφει την y-συντεταγμένη του σημείου.
     *
     * @return Η y-συντεταγμένη του σημείου.
     */
    public double getY() {
        return y;
    }

    /**
     * Επιστρέφει την z-συντεταγμένη του σημείου.
     *
     * @return Η z-συντεταγμένη του σημείου.
     */
    public double getZ() {
        return z;
    }

    /**
     * Ορίζει την x-συντεταγμένη του σημείου.
     *
     * @param x Η νέα τιμή της x-συντεταγμένης που θα οριστεί.
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Ορίζει την y-συντεταγμένη του σημείου.
     *
     * @param y Η νέα τιμή της y-συντεταγμένης που θα οριστεί.
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Ορίζει την z-συντεταγμένη του σημείου.
     *
     * @param z Η νέα τιμή της z-συντεταγμένης που θα οριστεί.
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Μετατρέπει το αντικείμενο PointXYZ σε μια αναγνώσιμη αναπαράσταση ως συμβολοσειρά.
     *
     * @return Μια συμβολοσειρά που αναπαριστά το PointXYZ στη μορφή "(x, y, z)".
     */
    public String convertToString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}



