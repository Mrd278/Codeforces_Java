package Codeforces;
import java.util.Scanner;

public class Elephant
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long friends_house = sc.nextInt();
        int steps = 0;
        for(int i = 5; i >= 1; i--)
        {
            int temp_step = step_cal(friends_house, i);
            steps += temp_step;
            friends_house = friends_house % i;
        }
        System.out.println(steps);
        sc.close();
    }

    public static int step_cal(long distance, int step)
    {
        if(distance >= step)
        {
            return (int)(distance / step);
        }
        else
        {
            return 0;
        }
    }
}