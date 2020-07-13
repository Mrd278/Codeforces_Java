import java.util.HashMap;
import java.util.Scanner;

public class MagicSquare {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] square = new int[3][3];

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                square[i][j] = sc.nextInt();
            }
        }

        int result = solve(square);

        System.out.print("Result: " + result);
        sc.close();
    }

    private static int solve(int[][] square) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= 9; i++)
        {
            map.put(i, 0);
        }

        if(map.get(square[1][1]) == 0)
        {
            if(square[1][1] == 5)
            {
                res += 0;
            }
            else
            {
                res += Math.abs(square[1][1] - 5);
                map.replace(5, 1);
            }
        }

        int[] even = new int[4];
        int k = 0;
        for(int i = 0; i < 3; i+= 2)
        {
            for(int j= 0; j < 3; j += 2)
            {
                even[k++] = square[i][j];
            }
        }

        for(int i = 0; i < 4; i++)
        {
            if(even[i] % 2 == 0)
            {
                if(even[i] == 2)
                {
                    if(even[3-i] != 8)
                    {
                        res += Math.abs( 8 - even[3-i]);
                        map.replace(2,1);
                        map.replace(8,1);
                    }
                }
                else if(even[i] == 4)
                {
                    if(even[3-i] != 6)
                    {
                        res += Math.abs( 6 - even[3-i]);
                        map.replace(4,1);
                        map.replace(6,1);
                    }
                }
                else if(even[i] == 6)
                {
                    if(even[3-i] != 4)
                    {
                        res += Math.abs( 4 - even[3-i]);
                        map.replace(4,1);
                        map.replace(6,1);
                    }
                }
                else if(even[i] == 8)
                {
                    if(even[3-i] != 2)
                    {
                        res += Math.abs( 2 - even[3-i]);
                        map.replace(2,1);
                        map.replace(8,1);
                    }
                }
            }
        }
        return res;
    }
}
