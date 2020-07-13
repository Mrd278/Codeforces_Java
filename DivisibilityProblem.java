package Contest_Problems;

import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long[] result = new long[(int)n];

        for(int i = 0; i < n; i++)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(a <= b)
                result[i] = b - a;
            else
            {
                long c = 1;
                long d = 0;
                while(d < a)
                {
                    d = b * c++;
                }
                result[i] = d % a;
            }

        }

        for(int i = 0; i < n; i++)
        {
            System.out.println(result[i]);
        }

        sc.close();
    }
}
