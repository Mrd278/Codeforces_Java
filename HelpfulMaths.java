package Codeforces;
import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMaths {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		char[] nums = {'1', '2', '3'};
		String str = sc.next();
		char[] numbers = new char[(str.length() / 2) + 1];
		int k = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = 0; j < 3; j++)
			{
				if(str.charAt(i) == nums[j])
				{
					numbers[k++] = str.charAt(i);
					break;
				}
			}
		}
		
		Arrays.parallelSort(numbers);
		
		for(int i = 0; i<numbers.length; i++)
		{
			if(i == (numbers.length - 1))
			{
				System.out.println(numbers[i]);
			}
			else
				System.out.print(numbers[i] + "+");
		}
		
		sc.close();
	}
}
