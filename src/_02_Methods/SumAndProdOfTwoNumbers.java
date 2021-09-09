package _02_Methods;

import java.util.Scanner;

public class SumAndProdOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int sum = sum(n1, n2);
        System.out.println("Sum = " + sum);

        int prod = prod(n1, n2);
        System.out.println("Product = " + prod);

    }

    static int prod(int n1, int n2) {
        return n1 * n2;
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
