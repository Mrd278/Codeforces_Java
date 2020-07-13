import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int res = solve(n);
            System.out.println(res);
            t--;
        }
        sc.close();
    }

    public static int solve(int n)
    {
        int h = 1;
        if(n%2 == 0)
        {
            for(int i = 0; i < n/2; i++)
            {
                h = height_cal(h);
            }
            return h;
        }
        else
        {
            for(int i = 0; i < n/2; i++)
            {
                h = height_cal(h);
            }
            return h*2;
        }
    }

    public static int height_cal(int h)
    {
        return ((h*2) + 1);
    }
}
