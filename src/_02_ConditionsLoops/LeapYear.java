package _02_ConditionsLoops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = in.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            System.out.println("Year " + year + " is a Leap year.");
        }
        else {
            System.out.println("Year " + year + " is not a Leap year.");

        }
    }
}
