package Codeforces;
import java.util.Scanner;

public class YoungPhysicist {
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		
		int sum_x = 0;
		int sum_y = 0;
		int sum_z = 0;
		
		for(int i = 0; i < n; i++)
		{
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			z[i] = sc.nextInt();
			
			sum_x += x[i];
			sum_y += y[i];
			sum_z += z[i];
		}
		
		if(sum_x == 0 && sum_y == 0 && sum_z == 0)
			System.out.println("YES");
		
		else
			System.out.println("NO");
		
		sc.close();
	}
}
