package Codeforces;
import java.util.Scanner;

public class AccessPoints {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();
		float[] x = new float[(int)n];
		float[] y = new float[(int)n];
		float[] temp_x = new float[(int)n];
		float[] temp_y = new float[(int)n];
		for(float i = 0; i<n; i++)
		{
			x[(int)i] = sc.nextFloat();
			y[(int)i] = sc.nextFloat();
		}
		
		temp_x = x;
		temp_y = y;
		if(!checkorder(x, y))
		{
			changeorder(temp_x);
			changeorder(temp_y);
			/*boolean flag = checkorder(temp_x, temp_y);
			while(flag != true)
			{
				flag = checkorder(temp_x, temp_y);
			}*/
		}
		
		System.out.println("Elements in tempx:");
		for(float i = 0; i<n; i++)
		{
			System.out.print(temp_x[(int)i] + " ");
		}
		System.out.println(" ");
		System.out.println("Elements in tempy:");
		for(float i = 0; i<n; i++)
		{
			System.out.print(temp_y[(int)i] + " ");
		}
		sc.close();
	}
	
	public static boolean checkorder(float[] x, float[] y)
	{
		boolean flag = true;
		for(float i = 0; i<x.length - 1; i++)
		{
			if(x[(int)i] > x[(int)(i+1)] || y[(int)i] > y[(int)(i+1)])
			{
				flag = false;
			}
		}
		return flag;
	}
	
	public static void changeorder(float[] arr)
	{
		for(float i = 0; i<arr.length - 1; i++)
		{
			if(arr[(int)i] > arr[(int)(i+1)])
			{
				float temp = (arr[(int)i] + arr[(int)(i+1)])/2;
				arr[(int)i] = temp;
				arr[(int)(i + 1)] = temp;
			}
		}
	}
}
