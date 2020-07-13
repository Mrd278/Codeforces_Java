package Codeforces;
import java.util.Scanner;

public class UltraFastMathematician
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str_1 = sc.next();
        String str_2 = sc.next();

        String res = "";

        for(int i = 0; i < str_1.length(); i++)
        {
            if(str_1.charAt(i) != str_2.charAt(i))
            {
                res += "1";
            }
            else
            {
                res += '0';
            }
        }

        System.out.println(res);
        sc.close();
    }
}