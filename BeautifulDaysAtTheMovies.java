import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int res = solve(i, j, k);
        System.out.println("Result: " + res);
        sc.close();
    }

    public static int solve(int i, int j, int k)
    {
        int count = 0;
        int n;
        for(n = i; n <= j; n++)
        {
            if(reverse_diff(n) % k == 0)
                count++;
        }
        return count;
    }

    public static int reverse_diff(int num)
    {
        String str = Integer.toString(num);
        int len = str.length() - 1;
        int sum = 0;
        while(num != 0)
        {
            sum += (num % 10) * Math.pow(10, len--);
            num = num / 10;
        }
        return Math.abs(sum - Integer.parseInt(str));
    }
}
