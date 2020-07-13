import java.util.Scanner;

public class ThreeSum{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();

		int[] arr = new int[20];
		System.out.println("Enter the values of array: ");
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		Sort(arr, n);
		
		int[] negative = new int[20];
		int[] positive = new int[20];

		int j = -1;
		int c = -1;

		for(int i = 0; i<n; i++)
		{
			if(arr[i] < 0)
				negative[++j] = arr[i];
			else
				positive[++c] = arr[i];
		}

		Find_Triplet(positive, negative, c, j);
		sc.close();
	}

	public static void Sort(int[] arr, int n)
	{
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n-1; j++)
			{
				if(arr[i] < arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void Find_Triplet(int[] positive, int[] negative, int p, int j)
	{
		int a,b,c;
		int[][] result = new int[10][3];
		int m = 0, n = 0;
		for(int i = 0; i<p; i++)
		{
			a = positive[i];
			for(int k = 0; k<j; k++)
			{
				int left = 0;
				int right = j -1;
				b = negative[left];
				c = negative[right];

				if((a+b+c) == 0)
				{
					result[m][n++] = a;
					result[m][n++] = b;
					result[m][n++] = c;
					m++;
				}

				else if((a+b+c) < 0)
					left++;

				else
					right--;
			}
		}

		for(int i = 0; i<j; i++)
		{
			a = negative[i];
			for(int k = 0; k<p; k++)
			{
				int left = 0;
				int right = j -1;
				b = positive[left];
				c = positive[right];

				if((a+b+c) == 0)
				{
					result[m][n++] = a;
					result[m][n++] = b;
					result[m][n++] = c;
					m++;
				}

				else if((a+b+c) < 0)
					left++;

				else
					right--;
			}
		}

		for(int i = 0; i<m; i++)
		{
			for(int k = 0; k<n; k++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println("Hello");
		}

		System.out.println("m: "+m+" n: "+n);
	}
};