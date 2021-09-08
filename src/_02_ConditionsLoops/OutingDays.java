package _02_ConditionsLoops;

import java.util.Scanner;

public class OutingDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Month Number(1-12) : ");
        int month = in.nextInt();
        int days;
        if (month == 2)
            days = 14;
        else
            days = 15;

        System.out.println("You can go " + days + " days out in this month");
    }
}
