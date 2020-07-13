import java.util.Scanner;

public class AppendAndDelete {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        int k = sc.nextInt();

        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
            }
            else if(s.charAt(i) != t.charAt(j))
                break;
        }
        if(k >= (s.length() - i + t.length() - j))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
