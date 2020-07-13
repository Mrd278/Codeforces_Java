import java.util.Scanner;

public class LiftRequest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] f = new int[q];
            int[] d = new int[q];
            for(int i = 0; i < q; i++)
            {
                f[i] = sc.nextInt();
                d[i] = sc.nextInt();
            }
            int res = solve(f, d);
            System.out.println(res);
            t--;
        }
        sc.close();
    }

    public static int solve(int[] f, int[] d)
    {
        int res = 0;
        res += f[0];
        for(int i = 0; i < f.length-1; i++)
        {
            res += Math.abs(f[i] - d[i]);
            res += Math.abs(d[i] - f[i+1]);
        }

        res += Math.abs(f[f.length - 1] - d[d.length - 1]);
        res += d[d.length - 1];
        return res;
    }
}
