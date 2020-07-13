import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
        {
            ar[i] = sc.nextInt();
        }

        int result = solve(n, ar);
        System.out.println("Result: " + result);
        sc.close();
    }

    public static int solve(int n, int[] ar)
    {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(ar[i]))
            {
                map.replace(ar[i], map.get(ar[i]) + 1);
            }
            else
            {
                map.put(ar[i], 1);
            }
        }

        Set<Integer> s = map.keySet();
        Object[] keys = s.toArray();
        for(int i = 0; i < s.size(); i++)
        {
            int temp = map.get(keys[i]);
            result += temp / 2;
        }
        return result;
    }
}
