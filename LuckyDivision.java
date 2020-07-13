package Codeforces;
import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
    	String str = sc.next();
    	if(check_luck(str))
    		System.out.println("YES");
    	else {
    		if(Almost_lucky(str))
    			System.out.println("YES");
    		else
    			System.out.println("NO");
    	}
    	
    	sc.close();
      
    }
    
    public static boolean Almost_lucky(String num)
    {
    	int number = Integer.parseInt(num);
    	for(int i = 1; i < number; i++)
    	{
    		if(check_luck(Integer.toString(i)))
    		{
    			if(number % i == 0)
    			{
    				return true;
    			}
    		}
    	}
    	return false;
    }
    
    public static boolean check_luck(String num)
    {
    	int number = Integer.parseInt(num);
    	
    	if(number < 0)
    	{
    		return false;
    	}
    	
    	for(int i = 0; i < num.length(); i++)
    	{
    		if(num.charAt(i) != '4' && num.charAt(i) != '7')
    			return false;
    	}
    	return true;
    }
}
