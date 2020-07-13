package Codeforces;
import java.util.Scanner;

public class NextRound {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		
		int[] scores = new int[n];
		
		for(int i = 0; i<n; i++)
		{
			scores[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++)
		{
			if(scores[i] >= scores[k-1] && scores[i] > 0)
			{
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}