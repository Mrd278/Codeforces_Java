import java.util.Arrays;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++)
            p[i] = sc.nextInt();
        int[] result = solve(p);
        for(int value:result)
            System.out.println(value);
        //System.out.print(Arrays.binarySearch(p, 4));
        sc.close();
    }

    public static int findIndex(int arr[], int t)
    {

        // if array is Null
        if (arr == null) {
            return -1;
        }

        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
    }

    public static int[] solve(int[] p)
    {
        int[] res = new int[p.length];
        for(int i = 0; i < p.length; i++)
            res[i] = findIndex(p, findIndex(p, i+1) + 1) + 1;
        return res;
    }
}
