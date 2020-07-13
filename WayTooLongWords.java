package Codeforces;
import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i = 0; i<n; i++)
		{
			str[i] = sc.next();
		}
		
		for(int i = 0; i<n; i++)
		{
			if(str[i].length() > 10)
			{
				System.out.print(str[i].charAt(0));
				System.out.print(str[i].length() - 2);
				System.out.print(str[i].charAt(str[i].length() - 1));
				System.out.println("");
			}
			else
			{
				System.out.println(str[i]);
			}
		}
		
		sc.close();
	}
}
