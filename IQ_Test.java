package Codeforces;
import java.util.Scanner;

public class IQ_Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int odd = count(arr, "odd");
        int even = count(arr, "even");

        if(odd == 1)
        {
            for(int i = 0; i < n; i++)
            {
                if(arr[i] % 2 == 1)
                {
                    System.out.print(i+1);
                    break;
                }    
            }
        }
        else if(even == 1)
        {
            for(int i = 0; i < n; i++)
            {
                if(arr[i] % 2 == 0)
                {
                    System.out.print(i+1);
                    break;
                }    
            }
        }
        sc.close();
    }

    public static int count(int[] arr, String str)
    {
        int c = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(str == "odd")
            {
                if(arr[i] % 2 == 1)
                    c++;
            }
            else
            {
                if(arr[i] % 2 == 0)
                    c++;
            }
        }
        return c;
    }
}