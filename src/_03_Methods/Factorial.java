package _03_Methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();

        int result = factorial(num);
        System.out.println(num + "! = " + result);
    }

    static int factorial(int num) {
        int fact = 1;
        if (num != 0 && num != 1) {
            while (num > 1) {
                fact *= num;
                num--;
            }
        }
        return fact;

    }
}
