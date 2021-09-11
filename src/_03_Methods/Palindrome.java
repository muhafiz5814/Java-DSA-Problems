package _02_Methods;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = in.nextInt();

        if (isPalindrome(n))
            System.out.println("Number " + n + " is Palindrome");
        else
            System.out.println("Number " + n + " is NOT Palindrome");
    }

    static boolean isPalindrome(int n) {
        int original = n;
        int n1 = 0;
        while (n > 0) {
            n1 = n1 * 10 + (n % 10);
            n /= 10;
        }
        return n1 == original;
    }
}
