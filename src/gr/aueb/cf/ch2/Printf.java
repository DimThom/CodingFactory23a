package gr.aueb.cf.ch2;

public class Printf {
    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int din = 0;
        int mod = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        din = num1 / num2;
        mod = num1 % num2;

        System.out.printf("sum: %d, sub: %d, mul: %d,din: %d mod: %d",
                sum, sub, mul, din, mod);
    }
}
