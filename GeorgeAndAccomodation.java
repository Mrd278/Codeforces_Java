package Codeforces;
import java.util.Scanner;

public class GeorgeAndAccomodation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] q = new int[n];
        int[] p = new int[n];
        int[] space_ = new int[n];
        int result = 0;

        for(int i = 0; i < n; i++)
        {
            p[i] = sc.nextInt();
            q[i] = sc.nextInt();
        }

        space_ = diff_gen(p, q);
        result = room_avail(space_);

        System.out.println(result);
        sc.close();
    }

    // function which generates an array which contains the space available in particular room
    public static int[] diff_gen(int[] p, int[] q)
    {
        int[] space_ = new int[q.length];
        for(int i = 0; i < q.length; i++)
        {
            space_[i] = q[i] - p[i];
        }
        return space_;
    }

    // function which tells number of rooms available in the domitory
    public static int room_avail(int[] space_)
    {
        int count = 0;
        for(int i = 0; i < space_.length; i++)
        {
            if(space_[i] >= 2)
            {
                count++;
            }
        }

        return count;
    }
}