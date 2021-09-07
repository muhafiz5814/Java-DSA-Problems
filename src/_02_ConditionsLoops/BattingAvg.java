package _02_ConditionsLoops;

import java.util.Scanner;

public class BattingAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int runs, matches, not_out, out;
        System.out.print("Total runs = ");
        runs = in.nextInt();
        System.out.print("Total matches played = ");
        matches = in.nextInt();
        System.out.print("Total not out : ");
        not_out = in.nextInt();

        out = matches - not_out;
        if (out == 0)
        {
            System.out.println("Batting average NA");
        }
        else {
            float avg = (float)runs / out;
            System.out.println("Batting average of player is : " + avg);
        }

    }
}
