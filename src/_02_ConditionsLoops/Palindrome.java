package _02_ConditionsLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, rev_num = 0;
        System.out.print("Enter the number : ");
        num = in.nextInt();


        int temp = num, last;
        while (temp > 0)
        {
            last = temp % 10;
            rev_num = rev_num * 10 + last;
            temp /= 10;
        }

        if (rev_num == num)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
