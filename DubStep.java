package Codeforces;
import java.util.Scanner;

public class DubStep
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        /*int len = str.length();
        String new_str = "";*/
        
        str = str.replaceAll("WUB", " ");
        while(str.charAt(0) == ' ')
        {
            str = str.substring(1);
        }
        while(str.charAt(str.length() - 1) == ' ')
        {
            str = str.substring(0, str.length()-1);
        }
        /*for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i) == ' ' && str.charAt(i+1) == ' ')
            {
                new_str = str.substring(0, i);
                new_str += str.substring(i+1, len-1);
                str = new_str;
            }
        }*/
        
        //System.out.println(str.length());
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ' && str.charAt(i+1) == ' ')
            {
                continue;
            }
            else
                System.out.print(ch);
        }
        sc.close();
    }
}