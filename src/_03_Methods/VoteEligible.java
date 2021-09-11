package _02_Methods;

import java.util.Scanner;

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = in.nextInt();

        if (isEligible(age))
            System.out.println("Candidate is Eligible to Vote");
        else
            System.out.println("Candidate is NOT Eligible to Vote");

    }

    static boolean isEligible(int age) {
        return age >= 18;
    }
}
