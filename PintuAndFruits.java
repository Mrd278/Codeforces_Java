package Contest_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class PintuAndFruits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] F = new int[N];
            int[] P = new int[N];
            int[] Cost = new int[M];

            for(int j = 0; j < N; j++)
            {
                F[j] = sc.nextInt();
            }

            for(int j = 0; j < N; j++)
            {
                P[j] = sc.nextInt();
            }

            for(int k = 1; k <= M; k++)
            {
                int sum = 0;

                int index = Arrays.binarySearch(F, k);
                if(index >= 0)
                {
                    for(int m = 0; m < N; m++)
                    {
                        if(F[m] == k)
                        {
                            sum += P[m];
                        }
                    }
                    Cost[k-1] = sum;
                }
                else
                {
                    Cost[k-1] = -1;
                }
            }

            Arrays.sort(Cost);
            for(int k = 0; k < M; k++)
            {
                if(Cost[k] >= 0)
                {
                    System.out.println(Cost[k]);
                    break;
                }
            }
        }

        sc.close();
    }
}
