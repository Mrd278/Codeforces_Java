import java.util.Scanner;

public class Xenia_And_RingRoad {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long[] arr = new long[(int)m];

        for(int i = 0; i < m; i++)
        {
            arr[i] = sc.nextLong();
        }

        long count = 0;
        long j = 1;
        for(int i = 0; i < m; i++)
        {
            if(j == arr[i])
                count += 0;
            else if(i == 0)
            {
                count += arr[i] - 1;
            }
            else if(j < arr[i])
            {
                count += arr[i] - j;
            }
            else if(j > arr[i])
            {
                count += n - j;
                count += arr[i];
            }
            j = arr[i];
        }

        System.out.print(count);

        sc.close();
    }
}
