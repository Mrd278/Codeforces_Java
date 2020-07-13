package Codeforces;
import java.util.Scanner;

public class PetyaAndStrings {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str_1 = sc.next();
		String str_2 = sc.next();
		
		int result = str_1.compareToIgnoreCase(str_2);
		
		if(result > 0)
			result = 1;
		else if(result < 0)
			result = -1;
		System.out.println(result);
		sc.close();
	}
}
