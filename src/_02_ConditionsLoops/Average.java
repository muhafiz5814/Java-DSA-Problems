package _02_ConditionsLoops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers to calculate average");
        int n, count = 0, sum = 0;
        while (true)
        {
            n = in.nextInt();
            if (n == 0)
                break;
            sum += n;
            count++;
        }
        float avg = (float)(sum) / count;
        System.out.println("Average = " + avg);

    }
}
