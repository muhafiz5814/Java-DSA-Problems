package _02_ConditionsLoops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner det = new Scanner(System.in);

        System.out.println("Please provide following details to calculate your electricity bill : ");
        System.out.print("Watt per hour : ");
        int w = det.nextInt();
        System.out.print("time(in days) : ");
        int t = det.nextInt();
        System.out.print("cost per unit : ");
        float c = det.nextFloat();

        int tu = w * 24 * t / 1000;
        float tc = tu * c;
        System.out.println("Your total bill is : " + tc);


    }
}
