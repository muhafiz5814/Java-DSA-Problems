package _02_Methods;

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = in.nextInt();

        if (isEven(n))
            System.out.println("It's an even number");
        else
            System.out.println("It's an odd number");
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
