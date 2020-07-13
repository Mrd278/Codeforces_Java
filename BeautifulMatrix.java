package Codeforces;
import java.util.Scanner;

public class BeautifulMatrix {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int row = 0, column = 0;
		int[][] matrix = new int[5][5];
		
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				matrix[i][j] = sc.nextInt();
				
				if(matrix[i][j] == 1)
				{
					row = i+1;
					column = j+1;
				}
			}
		}
		
		int result = Math.abs(3-row) + Math.abs(3 - column);
		
		System.out.println(result);
		sc.close();
	}
}
