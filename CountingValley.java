import java.util.Scanner;

public class CountingValley {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int result = solve(n, s);
        System.out.print("Result: " + result);
        sc.close();
    }

    public static int solve(int n, String s)
    {
        int result = 0;
        int equalizer = 0;
        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == 'D')
            {
                int j = i;
                equalizer += -1;
                while(equalizer != 0 )
                {
                    if(s.charAt(++j) == 'U')
                        equalizer += 1;
                    else
                        equalizer += -1;
                }
                result++;
                i = j;
            }
            else if(s.charAt(i) == 'U')
            {
                int j = i;
                equalizer += 1;
                while(equalizer != 0)
                {
                    if(s.charAt(++j) == 'U')
                        equalizer += 1;
                    else
                        equalizer += -1;
                }
                i = j;
            }

        }


        return result;
    }
}
