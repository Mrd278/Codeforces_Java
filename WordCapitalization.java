package Codeforces;
import java.util.Scanner;

public class WordCapitalization {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		if(Character.isLowerCase(str.charAt(0)))
		{
			str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
		}
		
		System.out.println(str);
		
		sc.close();
	}
}
