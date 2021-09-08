package _02_ConditionsLoops;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();
        int sum = 0;

        while (num > 0)
        {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
