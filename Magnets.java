//package Codeforces;
import java.util.Scanner;
 
public class Magnets
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] arr = new int[(int)n];
        
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int count  = 1;
        for(int i = 0; i < n - 1; i++)
        {
            if(arr[i] != arr[i+1])
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}