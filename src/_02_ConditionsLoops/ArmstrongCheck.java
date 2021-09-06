package _02_ConditionsLoops;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number : ");
        int num = in.nextInt();

//        calculating the number of digits of number
        int last, digits = 0, temp = num;
        while (temp > 0)
        {
            last = temp % 10;
            digits++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

//        checking for armstrong
        while (temp > 0)
        {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp /= 10;
        }

        if (sum == num)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }

    }
}
