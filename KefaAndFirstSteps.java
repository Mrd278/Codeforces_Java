package Codeforces;
import java.util.Scanner;

public class KefaAndFirstSteps
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] money = new long[(int)n];
        for(int i = 0; i < n; i++)
        {
            money[i] = sc.nextLong();
        }
        long len = subsegment_len(money);
        System.out.print(len);
        sc.close();
    }

    // function to tell the maximum length of increasing subsegment
    public static long subsegment_len(long[] money_)
    {
        long count = 1;
        long max_ = 1;

        for(int i = 0; i < money_.length; i++)
        {
            if(i > 0)
            {
                if(money_[i] >= money_[i-1])
                {
                    count++;
                    max_ = Math.max(max_, count);
                }
                else
                {
                    count = 1;
                }
            }
        }
        return max_;
    }
}