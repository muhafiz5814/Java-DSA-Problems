package _02_ConditionsLoops;

import java.util.Scanner;

public class NCr_nPr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice, n, r, n_r;
        System.out.println("What do you want to calculate :\n1.Permutation(Enter 1)\t\t2.Combination(Enter 2)" +
                "\t\t3.Both(Enter 3)");
        choice = in.nextInt();

        long fact_n = 1, fact_r = 1, fact = 1;
        System.out.print("Number of objects(n) : ");
        n = in.nextInt();
        System.out.print("Selected objects(r) : ");
        r = in.nextInt();

        n_r = n - r;

        while (n > 1)
        {
            fact_n *= n;
            n--;
        }

        while (n_r > 1)
        {
            fact *= n_r;
            n_r--;
        }

        if (choice == 1)
        {
//            permutation
            float per = (float)(fact_n / fact);
            System.out.println("Permutation is : " + per);
        }
        else if (choice == 2)
        {
//            combination
            while (r > 1)
            {
                fact_r *= r;
                r--;
            }
            float com = (float)(fact_n / (fact * fact_r));
            System.out.println("Combination is : " + com);
        }
        else if (choice == 3)
        {
//            permutation
            float per = (float)(fact_n / fact);
            System.out.println("Permutation is : " + per);

//            combination
            while (r > 1)
            {
                fact_r *= r;
                r--;
            }
            float com = (float)(fact_n / (fact * fact_r));
            System.out.println("Combination is : " + com);

        }
    }
}
