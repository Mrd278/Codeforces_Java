package Codeforces;
import java.util.Scanner;
import java.util.Arrays;

public class Puzzels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] f = new int[m];
        for(int i = 0; i < m; i++)
        {
            f[i] = sc.nextInt();
        }
        Arrays.sort(f);
        int start = 0;
        int end = n-1;
        int[] diff = new int[m-n+1];
        while(end < m)
        {
            diff[start] = diff_cal(f, start++, end++);
        } 
        Arrays.sort(diff);
        System.out.println(diff[0]);
        sc.close();
    }

    public static int diff_cal(int[] f, int start, int end)
    {
        return (f[end] - f[start]);
    }
}

/* Implementation of program
    Algorithm:
    n -> 4, m -> 6
    f[m] -> 5 7 9 10 1 6 15 2 3 7 8 45 6 20
    sort(f) -> 1 2 3 5 6 6 7 7 8 9 10 15 20 45
    first n elements selected
    s -> 5 7 10 10
    res = max(s) - min(s) -> 5 
*/