package _03_Methods;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();

        if (isPythagorean(n1, n2, n3))
            System.out.println("These are Pythagorean Triples");
        else
            System.out.println("These are NOT Pythagorean Triples");
    }

    static boolean isPythagorean(int n1, int n2, int n3) {

        int max = maximum(n1, n2, n3);
        int square;
        if (max == n1) {
            square = n1*n1;
            return square == n2*n2 + n3*n3;
        }
        else if (max == n2) {
            square = n2*n2;
            return square == n1*n1 + n3*n3;
        }
        else {
            square = n3*n3;
            return square == n2*n2 + n1*n1;
        }
    }

    static int maximum(int n1, int n2, int n3) {
        int max = n1;
        if (n2 > n1)
            max = n2;
        if (n3 > max)
            max = n3;
        return max;
    }
}
