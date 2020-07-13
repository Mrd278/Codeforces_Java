package Codeforces;
import java.util.Scanner;

public class BearAndBigBrother
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        while(limak - bob <= 0)
        {
            limak = limak * 3;
            bob = bob * 2;
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}