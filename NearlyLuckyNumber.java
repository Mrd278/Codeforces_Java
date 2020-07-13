//package Codeforces;
import java.util.Scanner;

public class NearlyLuckyNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0; 
        boolean flag = false;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '4' || str.charAt(i) == '7')
            {
                count++;
            }
        }
        if(check_luck(Integer.toString(count)))
        {
            flag = true;
        }
        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }

    // Function to check lucky number 
    public static boolean check_luck(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != '4' && str.charAt(i) != '7')
            {
                //System.out.println("check_luck if");
                return false;
            }
        }
        return true;
    }

}