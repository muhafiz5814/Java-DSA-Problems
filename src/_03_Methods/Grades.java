package _03_Methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        double marks = in.nextDouble();

        String result = grades(marks);
        System.out.println("Your result is : " + result);
    }

    static String grades(double marks) {
        if (marks <= 100 && marks >= 91)
            return "AA";
        else if (marks <= 90 && marks >= 81)
            return "AB";
        else if (marks <= 80 && marks >= 71)
            return "BB";
        else if (marks <= 70 && marks >= 61)
            return "BC";
        else if (marks <= 60 && marks >= 51)
            return "CD";
        else if (marks <= 50 && marks >= 41)
            return "DD";
        else
            return "Fail";
    }
}
