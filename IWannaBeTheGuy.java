package Codeforces;
import java.util.Scanner;

public class IWannaBeTheGuy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int total_levels = sc.nextInt();
        int q = sc.nextInt();
        int[] pass_levels = new int[total_levels];
        for(int i = 0; i< q; i++)
        {
            int temp = sc.nextInt();
            pass_levels[temp - 1] = 1;
        }
        int p = sc.nextInt();
        for(int i = 0; i < p; i++)
        {
            int temp = sc.nextInt();
            pass_levels[temp - 1] = 1;
        }
        int sum = 0;
        for(int i = 0; i < pass_levels.length; i++)
        {
            sum += pass_levels[i];
        }
        if(sum == total_levels)
        {
            System.out.print("I become the guy.");
        }
        else
        {
            System.out.print("Oh, my keyboard!");
        }
        sc.close();
    }
}