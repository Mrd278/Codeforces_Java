import java.util.Scanner;

public class Halloween
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//Input
		int p,d,m,s;
		p = sc.nextInt();
		d = sc.nextInt();
		m = sc.nextInt();
		s = sc.nextInt();
		
		//Algorithm
		int cost = 0;
		int count = 0;
		while(cost <= s)
		{
			cost += p;
			if(p-d >= m)
				p = p-d;
			else
				p = m;
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}