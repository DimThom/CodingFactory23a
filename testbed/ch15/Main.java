package gr.aueb.cf.testbed.ch15;

/**
 * Αυτή η κλάση δοκιμάζει τις λειτουργίες των σημείων και της χρησιμότητας στοιχείων σημείων.
 */
public class Main {
    public static void main(String[] args) {
        // Δημιουργία σημείων διαφορετικών διαστάσεων
        Point point = new Point(5.5);
        Point2D point2D = new Point2D(3.0, 4.0);
        Point3D point3D = new Point3D(1.0, 2.0, 3.0);

        // Υπολογισμός αποστάσεων από την αρχή των αξόνων για κάθε σημείο
        System.out.println("Distance from origin for Point: " + point.getDistanceFromOrigin());
        System.out.println("Distance from origin for Point2D: " + point2D.getDistanceFromOrigin());
        System.out.println("Distance from origin for Point3D: " + point3D.getDistanceFromOrigin());

        // Χρήση της χρησιμότητας στοιχείων σημείων για τον υπολογισμό αποστάσεων από την αρχή των αξόνων
        System.out.println("Distance from origin using PointUtil for Point: " + PointUtil.distanceFromOrigin(point));
        System.out.println("Distance from origin using PointUtil for Point2D: " + PointUtil.distanceFromOrigin(point2D));
        System.out.println("Distance from origin using PointUtil for Point3D: " + PointUtil.distanceFromOrigin(point3D));
    }
}


