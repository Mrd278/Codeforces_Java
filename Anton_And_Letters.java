package Codeforces;
import java.util.HashMap;
import java.util.Scanner;

public class Anton_And_Letters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        //boolean flag = Character.isAlphabetic(' ');
        //System.out.println(flag);
        String str = sc.nextLine();
        //str.replaceAll("\\s+", "");
        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isAlphabetic(str.charAt(i)))
            {
                map.putIfAbsent(str.charAt(i), i);
            }
            //System.out.print(str.charAt(i) + " ");
        }
        System.out.println(map.size());
        sc.close();
    }
}