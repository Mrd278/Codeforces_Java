import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int d1,d2,m1,m2,y1,y2;

        d1 = sc.nextInt();
        m1 = sc.nextInt();
        y1 = sc.nextInt();

        d2 = sc.nextInt();
        m2 = sc.nextInt();
        y2 = sc.nextInt();

        int answer = solve(d1, d2, m1, m2, y1, y2);
        System.out.print(answer);
        sc.close();
    }

    public static int solve(int d1, int d2, int m1, int m2, int y1, int y2)
    {
        //int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(y1 > y2)
            return 10000;
        else if(y1 == y2)
        {
            if(m1 > m2)
            {
                return 500*(m1-m2);
            }
            else if(m1 == m2)
            {
                if(d1 > d2)
                {
                    return 15*(d1-d2);
                }
                else
                {
                    return 0;
                }
            }
            else
                return 0;
        }
        else
            return 0;
    }
}
