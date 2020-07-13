package Codeforces;
import java.util.Scanner;

public class BeautifulYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        while(!flag)
        {
            n++;
            if(distinct_check(n))
            {
                flag = true;
            }
        }
        System.out.println(n);

        /*if(distinct_check(1987))
        {
            System.out.println("Distinct");
        }
        else
        {
            System.out.println("Have Common Element");
        }*/
        sc.close();
    }

    // function to check all elements are distinct
    public static boolean distinct_check(int n)
    {
        String number = Integer.toString(n);
        int[] numbers = new int[number.length()];
        for(int i = 0; i < number.length(); i++)
        {
            numbers[i] = Count(number, number.charAt(i));
        }

        boolean flag = true;
        for(int i = 0; i < number.length(); i++)
        {
            if(numbers[i] != 1)
            {
                flag = false;
            }
        }

        return flag;
    }

    // function to count a particular element in the string
    public static int Count(String str, char val)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == val)
            {
                count++;
            }
        }
        return count;
    }
}