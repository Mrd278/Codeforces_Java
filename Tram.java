package Codeforces;
import java.util.Scanner;

public class Tram {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Variables
		int capacity = 0;
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int current_passengers = 0;
		
		//loop for input and calculation of capacity
		for(int i = 0; i < n; i++)
		{			
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			current_passengers += b[i] - a[i];
			if(current_passengers > capacity)
				capacity = current_passengers;
		}
		
		System.out.println(capacity);
		
		sc.close();
	}
}
