package _02_Methods;

import java.util.Scanner;

public class MaxMinMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        int max = maximum(n1, n2, n3);
        int min = minimum(n1, n2, n3);

        System.out.println("Maximum among these numbers is : " + max);
        System.out.println("Minimum among these numbers is : " + min);

    }

    static int minimum(int n1, int n2, int n3) {
        int min = n1;
        if (n2 < n1)
            min = n2;
        if (n3 < min)
            min = n3;
        return min;
    }

    static int maximum(int n1, int n2, int n3) {
        int max = n1;
        if (n2 > n1)
            max = n2;
        if (n3 > max)
            max = n3;
        return max;
    }
}
