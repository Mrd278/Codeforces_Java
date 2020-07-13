package Codeforces;
import java.util.Scanner;

public class Football {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		boolean flag = false;
		
		String[] checker = {"0000000", "1111111"};
		
		for(int i = 0; i < 2; i++)
		{
			if(str.contains(checker[i]))
			{
				System.out.println("YES");
				flag = true;
				break;
			}
		}
		
		if(!flag)
			System.out.println("NO");
		sc.close();
	}
}
