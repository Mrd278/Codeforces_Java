package Codeforces;
import java.util.Scanner;
import java.util.Arrays;

public class AmusingJoke
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String guest_name = sc.next();
        String host_name = sc.next();
        String mixed_up_name = sc.next();
        guest_name = guest_name.toLowerCase();
        host_name = host_name.toLowerCase();
        mixed_up_name = mixed_up_name.toLowerCase();
        String combined_name = guest_name + host_name;
        combined_name = sortString(combined_name);
        mixed_up_name = sortString(mixed_up_name);

        //System.out.println(combined_name);
        //System.out.println(mixed_up_name);
        if(combined_name.contentEquals(mixed_up_name))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }

    public static String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    }
}