package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean isEven = false;

        System.out.println("Please insert a int");
        num = sc.nextInt();

        isEven = isEvenOddApp(num);

        System.out.println("Num " + num + " is even " + isEven);


    }

    /**
     * Evaluates an int  if it is even or not
     * @param n     the number (int) to evaluate
     * @return      true, if n is even, false otherwise
     */

    public static boolean isEvenOddApp(int n) {
       return n % 2 == 0;

//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
