package _01_IO;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name sir 🙂 : ");
        String name = input.nextLine();
        System.out.println("Nice to meet you Mr. " + name);

//        We can also do this without using variable as below
        //  System.out.println("Nice to meet you Mr. " + input.nextLine());

    }
}
