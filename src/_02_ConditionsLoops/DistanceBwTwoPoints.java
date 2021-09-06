package _02_ConditionsLoops;

import java.util.Scanner;

public class DistanceBwTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter first point's co-ordinates : ");
        float x1, y1;
        x1 = in.nextFloat();
        y1 = in.nextFloat();
        System.out.print("enter second point's co-ordinates : ");
        float x2, y2;
        x2 = in.nextFloat();
        y2 = in.nextFloat();

        double dist;
        dist = Math.sqrt((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        System.out.println("Distance between points (" + x1 +", " + y1 + ") and (" + x2 +", " + y2 + ") is : " + dist);


    }
}
