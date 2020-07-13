import java.util.Scanner;

public class MatrixDecomposition {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int[] p = new int[n];
            for(int i = 1; i <= n; i++)
            {
                int s = 1;
                for(int j = 0; j < (2*i - 1); i++)
                {
                    s *= a;
                }
                a *= s;
                p[i] = s;
            }
            int res = (int) (sum(p) % (Math.pow(10,9) + 7));
            System.out.println(res);
            t--;
        }
        sc.close();
    }

    public static int sum(int[] p)
    {
        int s = 0;
        for(int i = 0; i < p.length; i++)
            s += p[i];
        return s;
    }
}
