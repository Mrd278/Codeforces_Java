package Codeforces;
import java.util.Scanner;

public class Expression
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max_ = max_val(a,b,c);
        System.out.println(max_);
        sc.close();
    }

    public static int max_val(int a, int b, int c)
    {
        int result = 0;

        if( result < (a*b*c))
        {
            result = a*b*c;
        }
        if(result < (a + b + c))
        {
            result = (a + b + c);
        }
        if(result < ((a + b) * c))
        {
            result = ((a + b) * c);
        }
        if(result < (a * (b + c)))
        {
            result = (a * (b + c));
        }

        return result;
    }
}