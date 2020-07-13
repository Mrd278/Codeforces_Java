package Codeforces;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class BoyOrGirl {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		Set<String> hash_set = new HashSet<String>();
		for(int i = 0; i < str.length(); i++)
		{
			String temp_str = Character.toString(str.charAt(i));
			hash_set.add(temp_str);
		}
		
		if(hash_set.size() % 2 == 0)
		{
			System.out.println("CHAT WITH HER!");
		}
		else
			System.out.println("IGNORE HIM!");
		
		sc.close();
	}
}
