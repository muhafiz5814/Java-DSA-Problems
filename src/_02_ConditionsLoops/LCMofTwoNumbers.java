package _02_ConditionsLoops;

import java.util.Scanner;

//  In this solution we will see two methods of solving the question


public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two numbers to get LCM : ");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        double dividend = n1, div = n2;
        if (n2 > n1)
        {
            dividend = n2;
            div = n1;
        }

//  Method 1
//        In this method we will build a logic to calculate the LCM

        if (dividend % div == 0)
        {
            System.out.println("LCM = " + dividend);
        }
        else {
            double rem;
            double lcm = dividend;
            for (double i = 2; i <= div; i++) {
                lcm = dividend * i;
                rem = lcm % div;
                if (rem == 0) {
                    break;
                }
            }
            System.out.println("LCM = " + lcm);
        }
        

////       Method 2
////        In this method first HCF will be calculated then using the relation between LCM and HCF, LCM will be
////        calculated
//
//        double rem, div1;
//        do {
//            div1 = div;
//            rem = dividend % div;
//            dividend = div;
//            div = rem;
//            if (div == 1)
//                break;
//        }while (rem != 0);
//
//        double hcf, lcm;
//        if (div == 1)
//        {
//            hcf = div;
//        }
//        else {
//            hcf = div1;
//        }
//        lcm = n1 * n2 / hcf;
//        System.out.println("LCM = " + lcm);


    }
}

