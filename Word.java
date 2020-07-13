package Codeforces;
import java.util.Scanner;

public class Word
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count_up = Count_Upper_Case(str);
        int count_low = Count_Lower_Case(str);

        if(count_low >= count_up)
        {
            for(int i = 0; i < str.length(); i++)
            {
                str = str.replace(str.charAt(i), Character.toLowerCase(str.charAt(i)));
            }
        }
        else
        {
            for(int i = 0; i < str.length(); i++)
            {
                str = str.replace(str.charAt(i), Character.toUpperCase(str.charAt(i)));
            }
        }

        System.out.println(str);
        sc.close();
    }

    // function to count number of uppercase letters in the string
    public static int Count_Upper_Case(String str)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }

    // function to count number of lower case letters in the string
    public static int Count_Lower_Case(String str)
    {
        int count = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                count++;
            }
        }
        return count;
    }

}