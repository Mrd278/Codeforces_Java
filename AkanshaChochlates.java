import java.util.Scanner;
import java.util.Arrays;

public class AkanshaChochlates{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            solve(n,x,arr);
            t--;
        }
        sc.close();
    }

    public static void solve(int n, int x, int[] arr)
    {
        if(n > x)
        {
            int c = 0;
            for(int i = 0; i < n; i++)
            {
                int j;
                for(j = i; j < x+i; j++)
                {
                    if(j < n)
                    {
                        arr[j] -= c;
                    }
                }
                c++;
                i = j - 1;
                //System.out.println("i+j: "+ i);
            }
        }
        //String str = Arrays.toString(arr);
        //System.out.println(str);
        if(check(arr))
        {
            System.out.println("Impossible");
        }
        else
        {
            System.out.println("Possible");
        }
    }

    public static boolean check(int[] arr)
    {
        for (int value : arr) {
            if (value < 2)
                return true;
        }
        return false;
    }
}