package _02_ConditionsLoops;

import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String rev_str = "";

        for (int i = str.length()-1; i >= 0; i--)
        {
            rev_str += str.charAt(i);
        }

        System.out.println("Original string : " + str);
        System.out.println("Reversed string : " + rev_str);
        
    }
}
