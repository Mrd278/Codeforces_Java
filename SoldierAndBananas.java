package Codeforces;
import java.util.Scanner;

public class SoldierAndBananas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Inputs
		int k_price = sc.nextInt();
		long n_dollars = sc.nextLong();
		int w_bananas = sc.nextInt();
		long cost = Cost(k_price, w_bananas);
		
		if(n_dollars > cost)
			System.out.println("0");
		else
			System.out.println(cost - n_dollars);
		
		sc.close();
	}
	
	public static long Cost(int k, int w)
	{
		long cost = 0;
		
		for(int i = 1; i <= w; i++)
		{
			cost += i*k;
		}
		
		return cost;
	}
}
