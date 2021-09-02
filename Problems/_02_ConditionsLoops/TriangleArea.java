package _02_ConditionsLoops;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the height and base of triangle respectively : ");
        float h = in.nextFloat();
        float b = in.nextFloat();

        float area = h * b / 2;
        System.out.println("Area = " + area);

    }
}
