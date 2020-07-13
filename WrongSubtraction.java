package Codeforces;
import java.util.Scanner;

public class WrongSubtraction
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int k = sc.nextInt();
        String str = Long.toString(n);

        for(int i = 0; i < k; i++)
        {
            str = proceed(str);
        }

        System.out.println(str);
        sc.close();
    }
    
    public static String proceed(String str)
    {
        long number = Long.parseLong(str);
        if(str.charAt(str.length() - 1) == '0')
        {
            number = number / 10;
        }
        else
        {
            number -= 1;
        }
        return Long.toString(number);
    }
}