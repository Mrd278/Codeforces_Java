import java.util.Arrays;
import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int result = solve(n, k, arr);
        System.out.println("Result: " + result);
        sc.close();
    }

    public static int solve(int n, int k, int[] ar)
    {
        int count = 0;
        Arrays.sort(ar);
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if((ar[i] + ar[j]) % k == 0)
                    count++;
            }
        }
        return count;
    }
}
