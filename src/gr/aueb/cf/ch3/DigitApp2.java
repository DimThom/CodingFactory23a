package gr.aueb.cf.ch3;

import java.util.Scanner;

public class DigitApp2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int rightmost = 0;
        int leftmost = 0;

        System.out.println("Please insert num (int)");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            count++;
            currentDigit = num % 10;
            sum += currentDigit;
            if (count == 1) {
                rightmost = currentDigit;
            }
            num = num / 10;
        } while (num != 0);

        leftmost = currentDigit;
        sumLeftRight = leftmost + rightmost;


        System.out.println("Count:" + count);
        System.out.println("Sum of digits:" + sum);
        System.out.println("Sum of leftmost, rightmost digits: " + sumLeftRight);

    }
}
