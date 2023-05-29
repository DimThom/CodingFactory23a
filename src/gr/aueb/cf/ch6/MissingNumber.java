package gr.aueb.cf.ch6;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int missing = getMissing(arr);
        System.out.println("Ο αριθμός που λείπει είναι: " + missing);
    }

    public static int getMissing(int[] arr) {
        int n = arr.length;
        int total = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++)
            total -= arr[i];
        return total;
    }
}
