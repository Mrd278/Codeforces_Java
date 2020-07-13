import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int res = solve(k, arr);
        System.out.println("Result: " + res);
        sc.close();
    }

    public static int solve(int k, int[] arr)
    {
        int res = 0;
        Arrays.sort(arr);
        res = arr[arr.length - 1] - k;
        if(res < 0)
            res = 0;
        return res;
    }
}
