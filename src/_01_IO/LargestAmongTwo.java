package _01_IO;

import java.util.Scanner;

public class LargestAmongTwo {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        System.out.print("Please enter numbers to compare : ");
        int n1, n2;
        n1 = ip.nextInt();
        n2 = ip.nextInt();

        int max = n1;
        if (n2 > n1)
        {
            max = n2;
        }

        if (n2 == n1)
        {
            System.out.println("Both are Equal");
        }
        else
        {
            System.out.println("Largest among these two numbers is : " + max);
        }
    }
}
