import java.util.Arrays;
import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            String res = solve(k, arr);
            System.out.println(res);
            t--;
        }
        sc.close();
    }

    public static String solve(int k, int[] a)
    {
        int count = 0;
        Arrays.sort(a);
        for (int value : a) {
            if (value <= 0)
                count++;
            else
                break;
        }
        if(count >= k)
            return "NO";
        return "YES";
    }
}
