package _02_ConditionsLoops;

public class SubtractProdAndSum {
    public static void main(String[] args){
        int num = 487;

        int prod = 1, sum = 0, rem;
        while (num > 0)
        {
            rem = num % 10;
            prod *= rem;
            sum += rem;
            num /= 10;
        }
        System.out.println("Prod - Sum : " + (prod - sum));

    }
}
