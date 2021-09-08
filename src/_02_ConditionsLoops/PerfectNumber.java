package _02_ConditionsLoops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        double num = in.nextDouble();

        double d, sum = 1;
        for(double i = 2; i*i <= num; i++)
        {
            if (num % i == 0)
            {
                d = num / i;
                if (d != i)
                {
                    sum = sum + i + d;
                }
            }
        }
        if (sum == num)
        {
            System.out.println("It is a Perfect Number");
        }
        else {
            System.out.println("It is not a Perfect Number");
        }
    }
}
