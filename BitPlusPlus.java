package Codeforces;
import java.util.Scanner;

public class BitPlusPlus {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] code = new String[n];
		for(int i = 0; i<n; i++)
		{
			code[i] = sc.next();
		}
		int sum = 0;
		for(int i = 0; i<n; i++)
		{
			int val = decode(code[i]);
			sum += val; 
		}
		
		System.out.println(sum);
		sc.close();
	}
	
	public static int decode(String str)
	{
		int result = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.contains("++"))
			{
				result = 1;
			}
			else if(str.contains("--"))
			{
				result = -1;
			}
		}
		
		return result;
	}
}
