package Codeforces;
import java.util.Scanner;

public class Translation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        //System.out.println(reverse_str(s));
        if(Compare_str(reverse_str(s), t))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }

    // function to generate a reverse string
    public static String reverse_str(String str)
    {
        String rev_str = "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev_str += str.charAt(i);
        }
        return rev_str;
    }

    // function to compare two strings and returns a boolean value
    public static boolean Compare_str(String str_1, String str_2)
    {
        if(str_1.length() == str_2.length())
        {
            for(int i = 0; i < str_1.length(); i++)
            {
                if(str_1.charAt(i) != str_2.charAt(i))
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }

        return true;
    }

}