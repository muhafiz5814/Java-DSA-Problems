package _02_Methods;

import java.util.Scanner;

public class PrimeNumbersSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers(in increasing order) to get series of Prime Numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        primeNumbers(n1, n2);
    }

    static void primeNumbers(int n1, int n2) {
        int count = 0;
        for (int n = n1; n <= n2; n++) {
            int c = 0;
            int a = 2;
            if (n > 1) {
                while (a*a <= n) {
                    if (n % a == 0) {
                        c = 1;
                        count++;
                        break;
                    }
                    a++;
                }
            }
            if (c == 0)
                System.out.print(n + " ");
        }
        if (count == n2 - n1 + 1)
            System.out.println("There are not Prime numbers between these two numbers.");
    }
}
