package _02_ConditionsLoops;

import java.util.Scanner;

public class CalculateCommission {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float sales_goal = 15000.00f;
        float commission, total_sold;
        System.out.print("Enter total sales : ");
        float total_sales = in.nextFloat();

        if (total_sales <= sales_goal * 0.5)
        {
            commission = total_sales * 1 / 100;
            total_sold = total_sales + commission;
        }
        else if (total_sales <= sales_goal * 0.7)
        {
            commission = total_sales * 2.5f / 100;
            total_sold = total_sales + commission;
        }
        else
        {
            commission = total_sales * 3.5f / 100;
            total_sold = total_sales + commission;
        }

        System.out.println("Total sold = " + total_sold);


    }
}
