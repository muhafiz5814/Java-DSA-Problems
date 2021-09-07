package _02_ConditionsLoops;

import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m1,m2,m3,m4,m5;
        int n = 5;
        System.out.println("Enter marks of five subjects :");
        m1 = in.nextInt();
        m2 = in.nextInt();
        m3 = in.nextInt();
        m4 = in.nextInt();
        m5 = in.nextInt();
        float sum;

        sum = (float)(m1 + m2 + m3 + m4 + m5)/10;

        float cgpa, cgpa_per;
        cgpa = sum/n;
        cgpa_per = 9.5f * cgpa;

        System.out.println("CGPA : " + cgpa);
        System.out.println("Percentage : " + cgpa_per);

    }
}
