import java.util.Scanner;

public class ChoclateFeast
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t,n,c,m;
		t = sc.nextInt();
		while(t !=0)
		{
			int number_of_choclates = 0, rem;
			n = sc.nextInt();
			c = sc.nextInt();
			m = sc.nextInt();
			
			number_of_choclates += (int)n/c;
			n = (int)n/c;
			while(n > 1)
			{
				if(n >= m)
					rem = n%m;
				else
					rem = 0;
				number_of_choclates += (int)n/m;
				n = (int)n/m+rem;
			}
			System.out.println(number_of_choclates);
			t--;
		}
		sc.close();		
	}
}