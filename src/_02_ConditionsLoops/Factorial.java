package _02_ConditionsLoops;

public class Factorial {
    public static void main(String[] args) {

        long n = 14;
        long fact = 1;
        for (int i = (int)n; i >= 1; i--)
        {
            fact *= i;
        }
        System.out.println("Factorial = " + fact);

    }
}
