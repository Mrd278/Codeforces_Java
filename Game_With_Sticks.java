import java.util.Scanner;

public class Game_With_Sticks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n <= m)
        {
            if(n % 2 == 0)
            {
                System.out.println("Malvika");
            }
            else
            {
                System.out.println("Akshat");
            }
        }
        else
        {
            if(m % 2 == 0)
            {
                System.out.println("Malvika");
            }
            else
            {
                System.out.println("Akshat");
            }
        }
        sc.close();
    }
}