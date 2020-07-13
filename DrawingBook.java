import java.util.Arrays;
import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int res = solve(n, p);

        System.out.print("Result: " + res);
        sc.close();
    }

    public static int solve(int n, int  p)
    {
        int result[] = new int[2];
        if(even_num(n))
        {
            if(n - p == 0 || p == 1)
            {
                return 0;
            }
            result[1] = (n-p - 1)/2 + 1;
            result[0] = (p - 2)/2 + 1;
        }
        else
        {
            if(n - p == 0 || p == 1)
                return 0;
            result[0] = (p-2)/2 + 1;
            result[1] = (n - p)/2;
        }
        Arrays.sort(result);
        return result[0];
    }

    public static boolean even_num(int num)
    {
        if(num % 2 == 0)
            return true;
        return false;
    }
}
