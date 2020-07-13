/* We have n teams and each is gonna invite each other team to their stadium for matches.
    Algorithm:
    total_matches = n*(n-1)
    host_jersey[int n] <- host_jersey_color_code
    guest_jersey[int n] <- guest_jersey_color_code
    if home_host_jersey == opponent_guest_jersey
        home_host_jersey = home_guest_jersey
        c++
    return c
*/

package Codeforces;
import java.util.Scanner;

public class Games
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[i][0] == arr[j][1] && i != j)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}