package _01_IO;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.println("Please enter the following details to calculate S.I.");
        int p, t;
        float r;
        System.out.print("Principle : ");
        p = ip.nextInt();
        System.out.print("Time (in years) : ");
        t = ip.nextInt();
        System.out.print("Rate : ");
        r = ip.nextFloat();

//        This block of function will calculate the simple interest
        float si = p * t * r / 100;
        System.out.println("Simple Interest for given details is : " + si);
        System.out.println("Total amount is : " + (si+p));

    }
}
