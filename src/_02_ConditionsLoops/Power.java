package _02_ConditionsLoops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long base, exponent;
        System.out.print("Base : ");
        base = in.nextInt();
        System.out.print("Exponent : ");
        exponent = in.nextInt();
        long result = 1;
        while (exponent > 0)
        {
            result *= base;
            exponent--;
        }

        System.out.println("Result = " + result);

    }
}
