package _02_ConditionsLoops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        CI = P(1+r/(n*100))^nt - P

        float p, r, t;
        int n;
        System.out.print("Enter Principle amount : ");
        p = in.nextFloat();
        System.out.print("Enter interest rate : ");
        r = in.nextFloat();
        System.out.print("Enter total time : ");
        t = in.nextFloat();
        System.out.println("For which time period you want to calculate CI : ");
        System.out.println("for Early enter 1\nfor Half Yearly enter 2\nfor Quarterly enter 3" +
                "\nfor monthly enter 4\nfor daily enter 5");
        n = in.nextInt();

//        CI = P(1+r/(n*100))^nt - P

        float b,a = 0;
        if (n == 1)
        {
            b = (1 + r/100);
            a = (float)Math.pow(b, t);
        }
        else if (n == 2)
        {
            b = (1 + r/(2*100));
            a = (float)Math.pow(b, 2*t);
        }
        else if (n == 3)
        {
            b = (1 + r/(4*100));
            a = (float)Math.pow(b, 4*t);
        }
        else if (n == 4)
        {
            b = (1 + r/(12*100));
            a = (float)Math.pow(b, 12*t);
        }
        else if (n == 5)
        {
            b = (1 + r/(365*100));
            a = (float)Math.pow(b, 365*t);
        }

        float ci;
        ci = p * a - p;
        System.out.println("Compound Interest is : " + ci);
        System.out.println("Total amount : " + (p + ci));


    }
}
