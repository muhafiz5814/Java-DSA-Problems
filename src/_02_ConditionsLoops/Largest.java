package _02_ConditionsLoops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers to find largest and enter 0 to get result : ");
        int n;
        int max = 0;

        while (true)
        {
            n = in.nextInt();
            if (n == 0)
                break;
            if (n > max)
            {
                max = n;
            }
        }
        System.out.println("Largest among entered numbers is : " + max);

    }
}
