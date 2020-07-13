package Codeforces;
import java.util.HashMap;
import java.util.Scanner;

public class Is_your_horseshoe_on_the_other_hoof
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i < 4; i++)
        {
            map.put(sc.nextInt(), i);
        }
        System.out.print(4 - map.size());
        sc.close();
    }
}