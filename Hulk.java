package Codeforces;
import java.util.Scanner;

public class Hulk
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String lv = "I love";
        String ht = "I hate";
        String bt = "that";
        String end = "it";
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(lv + " ");
            }
            else
            {
                System.out.print(ht + " ");
            }
            if(i != n)
                System.out.print(bt + " ");
        }

        System.out.print(end);
        sc.close();
    }
}