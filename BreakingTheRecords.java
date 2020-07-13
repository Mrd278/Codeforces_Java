import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];

        for(int i = 0; i < n; i++)
        {
            scores[i] = sc.nextInt();
        }

        int[] res = solve(scores);

        System.out.print(res[0] + " " + res[1]);

        sc.close();
    }

    public static int[] solve(int[] scores)
    {
        int[] result = new int[2];
        int max_count = 0;
        int min_count = 0;
        int max = scores[0];
        int min = scores[0];

        for(int i = 1; i < scores.length; i++)
        {
            if(scores[i] > max)
            {
                max_count++;
                max = scores[i];
            }
            if(scores[i] < min)
            {
                min_count++;
                min = scores[i];
            }
        }

        result[0] = max_count;
        result[1] = min_count;

        return result;
    }
}
