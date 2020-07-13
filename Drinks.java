package Codeforces;
import java.util.Scanner;

public class Drinks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            int temp = sc.nextInt();
            sum += temp;
        }
        System.out.print(sum / n);
        sc.close();
    }
}

/*Python code: 

n = int(input())
x = list(map(int, input().split()))
print(sum(x) / len(x))

*/