package Codeforces;
import java.util.Scanner;

public class StringTask {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String new_str = "";
		word = word.toLowerCase();
		
		for(int i = 0; i < word.length() ;i++)
		{
			if(!check_vowel(word.charAt(i)))
			{
				new_str += ".";
				new_str += word.charAt(i);
			}
		}
		System.out.println(new_str);
		sc.close();
	}
	
	public static boolean check_vowel(char v)
	{
		boolean flag = false;
		char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
		
		for(int i = 0; i<vowels.length; i++)
		{
			if(v == vowels[i])
			{
				flag = true;
				break;
			}
		}
		return flag;
	}
}