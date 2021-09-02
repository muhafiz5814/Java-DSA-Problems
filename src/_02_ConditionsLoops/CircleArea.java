package _02_ConditionsLoops;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        float area;

        area = 3.14f * r * r;
        System.out.println("Area : " + area);

    }
}
