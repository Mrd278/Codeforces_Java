package Codeforces;
import java.util.Scanner;
import java.util.Arrays;

public class Panagram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		// variables - taking input 
		int n = sc.nextInt();
		String str = sc.next();
		str = str.toLowerCase();
		String new_str = sortString(str);
		
		boolean flag = panagram_check(new_str);
		if(flag)
			System.out.print("YES");
		else
			System.out.print("NO");
		
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
	
	public static boolean panagram_check(String str)
	{
		int count = 1;
		if(str.length() >= 26)
		{
			for(int i = 0; i < str.length() - 1; i++)
			{
				if(str.charAt(i) != str.charAt(i+1))
				{
					count++;
				}
			}
		}
		
		if(count == 26)
		{
			//System.out.println(count);
			return true;
		}
		
		//System.out.println(count);
		return false;
	}
}