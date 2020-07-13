import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = solve(n);
        System.out.println(res);
        sc.close();
    }

    public static int solve(int n)
    {
        int res = 0;
        int m = 5;
        while(n != 0)
        {
            res += m / 2;
            m = (m / 2) * 3;
            n--;
        }
        return res;
    }
}
