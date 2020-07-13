import java.util.*;

public class MigratoryBirds {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }

        int res = solve(arr);
        System.out.println("Result: " + res);
        sc.close();
    }

    public static int solve(List<Integer> arr)
    {
        int result = 0;
        int[] r = new int[5];
        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++)
        {
            r[arr.get(i) - 1] += 1;
        }
        int max = 0;
        for(int i = 0; i < 5; i++)
        {
            if(r[i] > max)
            {
                max = r[i];
                result = i+1;
            }
        }
        return result;
    }
}
