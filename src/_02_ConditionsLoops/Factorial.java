package _02_ConditionsLoops;

public class Factorial {
    public static void main(String[] args) {

        int n = 7;
        int fact = 1;
        for (int i = n; i >= 1; i--)
        {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);

    }
}
