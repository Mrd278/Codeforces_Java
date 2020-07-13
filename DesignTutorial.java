import java.util.Scanner;

public class DesignTutorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i = 4; i < n-4; i++)
        {
            if(Check_Composite_Number(i))
            {
                if(Check_Composite_Number(n-i))
                {
                    System.out.println(i + " " + (n-i));
                    break;
                }
            }
        }
        sc.close();
    }

    public static boolean Check_Composite_Number(long n)
    {
        for(int i = 2; i <= (int)n/2; i++)
        {
            if(n%i == 0)
                return true;
        }
        return false;
    }
}
