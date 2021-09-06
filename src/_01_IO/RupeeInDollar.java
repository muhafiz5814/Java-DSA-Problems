package _01_IO;

import java.util.Scanner;

public class RupeeInDollar {
    public static void main(String[] args) {

        Scanner money = new Scanner(System.in);

        System.out.print("Enter amount in Rupees : ");
        float r = money.nextFloat();

        float d;
        d = r / 73.08f;
        System.out.println("Amount in Dollars is : " + d);

    }
}
