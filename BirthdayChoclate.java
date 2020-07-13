import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BirthdayChoclate {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> s = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            int temp = sc.nextInt();
            s.add(temp);
        }

        int d = sc.nextInt();
        int m = sc.nextInt();

        int result = solve(s, d, m);

        System.out.print("Result: " + result);
        sc.close();
    }

    public static int solve(List<Integer> s, int d, int m)
    {
        int count = 0;
        for(int i = 0; i < s.size(); i++)
        {
            if(m == 1)
            {
                if(s.contains(d)) {
                    count = count_d(s, d);
                }
            }

            else if(s.get(i) < d)
            {
                int j = i;
                int k = 0;
                int sum = 0;
                while(k != m && j < s.size())
                {
                    sum += s.get(j);
                    j++;
                    k++;
                }

                if(sum == d)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static int count_d(List<Integer> s, int d)
    {
        int count = 0;
        for (Integer integer : s) {
            if (integer == d) {
                count++;
            }
        }
        return count;
    }
}
