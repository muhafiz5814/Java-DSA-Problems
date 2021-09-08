package _02_ConditionsLoops;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.print("Enter an alphabet to see if it is Vowel or Consonant : ");
        char alp = st.next().trim().charAt(0);

        if (alp == 'a' || alp == 'A' || alp == 'e' || alp == 'E' || alp == 'i' || alp == 'I' ||
                alp == 'o' || alp == 'O' || alp == 'u' || alp == 'U')
        {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }
    }
}
