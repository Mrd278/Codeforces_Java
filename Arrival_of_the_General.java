package Codeforces;
import java.util.Scanner;
import java.util.Arrays;

public class Arrival_of_the_General
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] temp_arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
            temp_arr[i] = arr[i];
        }
        //temp_arr = arr;
        Arrays.sort(temp_arr);

        //System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        int max = temp_arr[n-1];
        int min = temp_arr[0];

        //System.out.println("max: " + max + " min: " + min);

        int index_max = index_(arr, max, "max");
        int index_min = n - 1 - index_(arr, min, "min");

        //System.out.println("index_max: " + index_max);
        //System.out.println("index_min: " + index_min);

        if(index_(arr, max, "max") < index_(arr, min, "min"))
            System.out.println(index_min + index_max);
        else
            System.out.println(index_min + index_max - 1);
        sc.close();
    }

    public static int index_(int[] arr, int val, String str)
    {
        if(str == "max")
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == val)
                {
                    //System.out.println("max_index: " + i);
                    return i;
                }
            }
        }

        if(str == "min")
        {
            for(int i = arr.length - 1; i > 0; i--)
            {
                if(arr[i] == val)
                {
                    //System.out.println("min_index: " + (arr.length - 1 - i));
                    return i;
                }
            }
        }
        return 0;
    }
}