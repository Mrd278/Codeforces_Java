package Codeforces;
import java.util.Scanner;

public class GravityFlip
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        while(!Asc_check(arr))
        {
            change_order(arr);
        }

        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static boolean Asc_check(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }

    public static void change_order(int[] arr) {
        for(int i = arr.length -1; i > 0; i--)
        {
            if(arr[i] < arr[i-1])
            {
                int diff = arr[i-1] - arr[i];
                arr[i] += diff;
                arr[i-1] -= diff;
            }
        }
    }
}