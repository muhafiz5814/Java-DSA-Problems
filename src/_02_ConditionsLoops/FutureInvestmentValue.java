package _02_ConditionsLoops;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the present value : ");
        double pv = in.nextFloat();
        System.out.print("Enter interest rate : ");
        double r = in.nextFloat();
        System.out.print("Enter time period in years : ");
        double t = in.nextFloat();

        double fv = pv * Math.pow((1+r/100), t);
        System.out.println("Future Investment Value = " + fv);

    }
}
