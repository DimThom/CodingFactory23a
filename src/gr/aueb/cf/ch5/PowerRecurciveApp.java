package gr.aueb.cf.ch5;

public class PowerRecurciveApp {
    public static void main(String[] args) {

        float a = 0; // αρχική τιμή της βάσης
        int n = 0; // αρχική τιμή του εκθέτη

        float result = power(a, n); // υπολογισμός του a^n με την power

        System.out.println(a + " ^ " + n + " = " + result);
    }

    public static float power(float a, int n) {
        if (n == 0) {
            return 1;
        }

        float temp = power(a, n/2);
        float result = temp * temp;

        if (n % 2 != 0) {
            result *= a;
        }

        return result;
    }
}