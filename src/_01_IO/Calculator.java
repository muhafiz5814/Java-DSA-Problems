package _01_IO;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);

        float n1, n2, res;
        char c;
        res = 0.0f;
        System.out.print("Enter two numbers and operation symbol : ");
        n1 = ip.nextFloat();
        n2 = ip.nextFloat();
        c = ip.next().charAt(0);

        if (c == '+')
        {
            res = n1 + n2;
        }
        else if (c == '-')
        {
            res = n1 - n2;
        }
        else if (c == '*')
        {
            res = n1 * n2;
        }
        else if (c == '/')
        {
            res = n1 / n2;
        }
        else {
            System.out.println("Invalid inputs!!!");
        }

        System.out.println("Result : " + res);

    }
}
