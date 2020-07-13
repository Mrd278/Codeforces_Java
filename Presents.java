package Codeforces;
import java.util.Scanner;

public class Presents
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];

        for(int i = 0; i < n; i++ )
        {
            p[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            q[p[i] - 1] = i+1;
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(q[i] + " ");
        }

        sc.close();
    }
}