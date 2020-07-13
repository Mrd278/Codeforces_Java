import java.util.Scanner;

public class FibonacciNumber{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int res = Fibonacci(n);
		System.out.println("result: " + res);
		sc.close();
	}

	public static int Fibonacci(int n)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		if(n > 2)
		{
			for(int i = 0; i < n - 2; i++)
			{
				c = a + b;
				a = b;
				b = c;
				System.out.println("i: " + i + " c : " + c);
			}
		}
		else{
			if(n == 1)
				return 0;
			else if(n == 2)
				return 1;
			}
		return c;
		
	}
}