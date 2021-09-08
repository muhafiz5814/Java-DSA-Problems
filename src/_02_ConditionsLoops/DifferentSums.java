package _02_ConditionsLoops;

import java.util.Scanner;

public class DifferentSums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers and to get results enter 0 then press enter");
        int num, neg_sum = 0, even_sum = 0, odd_sum = 0, sum;

        do {
            num = in.nextInt();
            if (num < 0)
                neg_sum += num;
            else if (num % 2 == 0)
                even_sum += num;
            else
                odd_sum += num;

        }while (num != 0);
        sum = neg_sum + even_sum + odd_sum;
        System.out.println("Sum of negative numbers : " + neg_sum);
        System.out.println("Sum of Positive Even numbers : " + even_sum);
        System.out.println("Sum of Positive Odd numbers : " + odd_sum);
        System.out.println("Total Sum : " + sum);

    }
}
