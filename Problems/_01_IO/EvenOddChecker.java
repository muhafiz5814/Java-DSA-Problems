package _01_IO;

import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the integer you want to check for even or odd : ");
        int num = input.nextInt();

        if(num%2 == 0){
            System.out.println("integer " + num + " is Even number");
        }
        else {
            System.out.println("integer " + num + " is Odd number");
        }

    }
}
