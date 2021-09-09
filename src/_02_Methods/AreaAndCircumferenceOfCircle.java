package _02_Methods;

import java.util.Scanner;

public class AreaAndCircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        int r = in.nextInt();

        double cf = circumference(r);
        System.out.println("Circumference of circle : " + cf);
        double area = area(r);
        System.out.println("Area of circle : " + area);

    }

    static double area(int r) {
        return 3.14 * Math.pow(r, 2);
    }

    static double circumference(int r) {
        return 2 * 3.14 * r;
    }
}
