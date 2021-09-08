package _02_ConditionsLoops;

import java.util.Scanner;

public class HCFofTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers to get HCF : ");
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();

        double dividend = n1, div = n2;
        if (n2 > n1)
        {
            dividend = n2;
            div = n1;
        }
        double rem, div1;
        do {
            div1 = div;
            rem = dividend % div;
            dividend = div;
            div = rem;
            if (div == 1)
                break;
        }while (rem != 0);

        if (div == 1)
        {
            System.out.println("HCF = " + div);
            System.out.println("These numbers are co-prime or relatively-prime");
        }
        else {
            System.out.println("HCF = " + div1);
        }
    }
}
