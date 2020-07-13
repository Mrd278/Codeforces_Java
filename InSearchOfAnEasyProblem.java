package Codeforces;
import java.util.Scanner;

public class InSearchOfAnEasyProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < n; i++)
        {
            int temp = sc.nextInt();
            if(temp == 1)
                flag = true;
        }
        if(flag)
            System.out.print("HARD");
        else
            System.out.print("EASY");
        sc.close();
    }
}