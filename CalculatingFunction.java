package Codeforces;

import java.util.Scanner;

public class CalculatingFunction
{
    public static void main(final String[] args)
    {
        final Scanner sc = new Scanner(System.in);
        final long n = sc.nextLong();
        long res = 0;
        if(n % 2 == 0)
            res = n/2;
        else
            res=(n-1)/2-n;

        System.out.println(res);
        sc.close();
    }
}