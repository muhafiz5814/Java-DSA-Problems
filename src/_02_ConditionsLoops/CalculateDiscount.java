package _02_ConditionsLoops;

import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter price of product : ");
        float price = in.nextFloat();
        System.out.print("Enter discount rate : ");
        int dis = in.nextInt();

        float dis_price, last_price;
//        discount price
        dis_price = price * dis / 100;
//        price after discount
        last_price = price - dis_price;
        System.out.println("Your final price after discount : " + last_price);

    }
}
