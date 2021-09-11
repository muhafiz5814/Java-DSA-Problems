package _03_Methods;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = in.nextInt();

        int sum = sumNatural(n);
        System.out.println("Sum of first " + n + " Natural numbers is : " + sum);
    }

    static int sumNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
