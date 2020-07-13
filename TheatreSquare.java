package Codeforces;
import java.util.Scanner;

public class TheatreSquare {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextInt();
		double m = sc.nextInt();
		double a = sc.nextInt();
		double num_h = Math.ceil(n/a);
		double num_w = Math.ceil(m/a);
		long result = (long)(num_w*num_h);
		System.out.println(result);
		
		sc.close();
	}
}
