package Codeforces;

import java.util.Scanner;

public class capslock
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str_ = sc.next();
        StringBuffer str = new StringBuffer(str_);
        boolean change = true;
        for(int i = 1; i < str.length(); i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                change = false;
                break;
            }
        }

        if(change)
        {
            convertOpposite(str);
        }
        System.out.println(str);
        sc.close();
    }

    public static void convertOpposite(StringBuffer str) 
    { 
        int ln = str.length(); 
             
        // Conversion using predefined methods 
        for (int i=0; i<ln; i++) 
        { 
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c)) 
                str.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");      
        } 
    }
}