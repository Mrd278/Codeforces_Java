package Codeforces;
import java.util.Scanner;

public class StonesOnTheTable {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		String str = sc.next();
		for(int i = 0; i < (n -1); i++)
		{
			char ch = str.charAt(i);
			
			if(ch == str.charAt(i+1))
				count++;
		}
		System.out.println(count);
		
		sc.close();
	}
}
