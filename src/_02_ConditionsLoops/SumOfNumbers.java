package _02_ConditionsLoops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers to sum and enter 0 to get result : ");
        int n;
        int sum = 0;

        while (true)
        {
            n = in.nextInt();
            if (n == 0)
                break;
            sum += n;
        }
        System.out.println("Sum of entered numbers is : " + sum);

    }
}
