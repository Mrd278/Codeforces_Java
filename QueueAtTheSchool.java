package Codeforces;
import java.util.Scanner;

public class QueueAtTheSchool
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String str = sc.next();
        String final_line = "";
        for(int i = 0; i < t; i++)
        {
            final_line = QueueChecker(str);
            str = final_line;
        }
        System.out.println(final_line);
        sc.close();
    }

    public static String QueueChecker(String line)
    {
        String new_str = "";
        for(int i = 0; i < line.length() - 1; i++)
        {
            if(line.charAt(i) == 'B' && line.charAt(i+1) == 'G')
            {
                new_str += "G";
                new_str += "B";
                new_str += line.substring(i+2);
                return new_str;
            }
            else
            {
                new_str = Character.toString(line.charAt(i));
            }
        }
        return new_str;
    }
}