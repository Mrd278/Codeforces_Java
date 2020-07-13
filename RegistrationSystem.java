import java.util.Scanner;

public class RegistrationSystem {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        StringBuilder[] Names = new StringBuilder[(int)n];
        StringBuilder[] final_names = new StringBuilder[(int)n];

        for(int i = 0; i < n; i++) {
            Names[i] = new StringBuilder(sc.next());
        }
        final_names[0] = Names[0];
        System.out.println("OK");

        int i = 1;
        while (i < n) {
            int c = 1;
            StringBuilder temp_name = Names[i];
            int len = temp_name.length();
            if(!SearchName(Names, Names[i], i, c))
            {
                final_names[i] = Names[i];
                System.out.println("OK");
            }
            else
            {
                while (SearchName(Names, Names[i], i, c))
                {
                    if(temp_name.length() > len)
                        Names[i] = temp_name.deleteCharAt(len);
                    //System.out.println("Names " + Names[i] + " temp " + temp_name);
                    Names[i].append(c++);
                }
                final_names[i] = Names[i];
                System.out.println(final_names[i]);
            }
            i++;
        }
        sc.close();
    }

    public static boolean SearchName(StringBuilder[] names, StringBuilder name, int i, int c)
    {
        for(int j = c-1; j < i; j++)
        {
            if(Compare(names[j], name))
                return true;
        }
        return false;
    }

    public static boolean Compare(StringBuilder n1, StringBuilder n2)
    {
        if(n1.length() != n2.length())
            return false;
        else
        {
            for(int i = 0; i < n1.length(); i++)
            {
                if(n1.charAt(i) != n2.charAt(i))
                    return false;
            }
        }
        return true;
    }
}