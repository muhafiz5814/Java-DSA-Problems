package _02_ConditionsLoops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = in.nextInt();
        int d;
        for(int i = 2; i*i <= n; i++)
        {
            if (n % i == 0)
            {
                System.out.print(i);
                d = n / i;
                if (d != i)
                    System.out.println("\t" + d);
            }
        }
    }
}
