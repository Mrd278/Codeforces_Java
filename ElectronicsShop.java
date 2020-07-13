import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ElectronicsShop {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] keyboards = new int[n];
        int[] drives = new int[m];

        for(int i = 0; i < n; i++)
        {
            keyboards[i] = sc.nextInt();
        }

        for(int i = 0; i < m; i++)
        {
            drives[i] = sc.nextInt();
        }

        int result = solve(keyboards, drives, b);
        System.out.print("Result: " + result);

        sc.close();
    }

    public static int solve(int[] keyboards, int[] drives, int b)
    {
        Arrays.sort(new int[][]{keyboards}, Collections.reverseOrder());//Descending order
        Arrays.sort(drives);//Ascending order

        int max = -1;
        for(int i = 0, j = 0; i < keyboards.length; i++){
            for(; j < drives.length; j++){
                if(keyboards[i]+drives[j] > b) break; //This prevents j from incrementing
                if(keyboards[i]+drives[j] > max)
                    max = keyboards[i]+drives[j];
            }
        }

        return max;
    }
}
