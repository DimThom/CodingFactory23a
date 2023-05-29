package gr.aueb.cf.ch1;

/**
 * Προσθετει δυο ακαιρεους
 * και εμφανιζει το αποτελεσμα
 * στο standard output (κονσολα)
 *
 * @author dimthoma
 */

public class AddApp {

    public static void main(String[] args) {
        // Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 10;
        int num2 = 7;
        int result;

        // Εντολες
        result = num1 + num2;

        //Εκτυπωση αποτελεσματων
        System.out.println("Το αποτελεσμα ειναι: " + result);
        System.out.printf("Το άθροισμα των %d και %d είναι %d", num1, num2, result);
    }
}
