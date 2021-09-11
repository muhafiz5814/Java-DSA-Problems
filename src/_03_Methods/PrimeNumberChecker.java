package _02_Methods;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = in.nextInt();

        if (isPrime(n))
            System.out.println("It's a prime number");
        else
            System.out.println("It's NOT a prime number");

    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else {
            int a = 2;
            while (a*a <= n) {
                if (n % a == 0)
                    return false;
                a++;
            }
        }
        return true;
    }
}
