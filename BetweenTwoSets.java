import java.util.*;

public class BetweenTwoSets {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            int temp = sc.nextInt();
            a.add(temp);
        }

        for(int i = 0; i < m; i++)
        {
            int temp = sc.nextInt();
            b.add(temp);
        }

        Collections.sort(a);
        Collections.sort(b);

        int count = solve(a, b);

        System.out.println("Result: " + count);

        sc.close();
    }

    public static int solve(List<Integer> a, List<Integer> b)
    {
        int count = 0;

        for(int i = a.get(a.size()-1); i <= b.get(0); i++)
        {
            if(condition_1(i,a))
            {
                if(condition_2(i, b))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean condition_1(int num, List<Integer> arr)
    {
        for (Integer integer : arr) {
            if (num % integer != 0)
                return false;
        }
        return true;
    }

    public static boolean condition_2(int num, List<Integer> arr)
    {
        for (Integer integer : arr) {
            if (integer % num != 0)
                return false;
        }
        return true;
    }
}
