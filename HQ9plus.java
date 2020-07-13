import java.util.Scanner;

public class HQ9plus
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean flag = false;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'H' || str.charAt(i) == 'Q' || str.charAt(i) == '9')
			{
				System.out.println("YES");
				flag = true;
				break;
			}
		}
		if(!flag)
			System.out.println("NO");
		sc.close();
	}
}