import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t != 0)
        {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long s = sc.nextLong();
            long res = solve(n, m, s);
            System.out.println(res);
            t--;
        }
        sc.close();
    }

    public static long solve(long n, long m, long s)
    {
        if(m > n)
            m = m % n;
        long i = ((s + m - 1) % n);
        if(i == 0)
            i = s;
        return i;
    }
}
