import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = 0;

        for(int i = 1; i <= n; i++)
        {
            if(i % 2 != 0)
            {
                pattern_print("#", m);
                System.out.println();
            }
            else
            {
                if(c == 0)
                {
                    pattern_print(".", m-1);
                    pattern_print("#", 1);
                    System.out.println();
                    c = 1;
                }
                else
                {
                    pattern_print("#", 1);
                    pattern_print(".", m-1);
                    System.out.println();
                    c = 0;
                }
            }
        }

        sc.close();
    }

    public static void pattern_print(String s, int num)
    {
        for(int i = 0; i < num; i++)
        {
            System.out.print(s);
        }
        //System.out.println();
    }
}
