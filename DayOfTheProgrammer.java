import java.util.Scanner;

public class DayOfTheProgrammer {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        String res_str = solve(y);
        System.out.print(res_str);
        sc.close();
    }

    public static String solve(int year)
    {
        String res_str = "";
        if(year >= 1700 && year <= 1917)
        {
            if(julian_check_leap(year))
            {
                res_str = "12.09." + year;
            }
            else
            {
                res_str = "13.09." + year;
            }
        }
        else if(year == 1918)
        {
            res_str = "26.09.1918";
        }
        else if(year >= 1919)
        {
            if(Gregorian_check_leap(year))
            {
                res_str = "12.09." + year;
            }
            else
            {
                res_str = "13.09." + year;
            }
        }

        return res_str;
    }

    public static boolean julian_check_leap(int y)
    {
        return y % 4 == 0;
    }

    public static boolean Gregorian_check_leap(int y)
    {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }
}
