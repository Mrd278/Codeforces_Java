package Codeforces;
import java.util.Scanner;

public class VanyaAndFence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] > h)
                count += 2;
            else
                count += 1;
        }
        System.out.println(count);

        sc.close();
    }
}