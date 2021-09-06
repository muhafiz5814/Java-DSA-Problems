package _02_ConditionsLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("length of fibonacci series : ");
        int l = in.nextInt();

        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int count = 2;
        int temp;
        while (count <= l)
        {
            temp = b;
            b += a;
            a = temp;
            System.out.print(" " + b);
            count++;
        }
    }
}
