import java.util.Scanner;
import java.lang.Math;

// Time Complexity -> O(n)
// Soln 2 (optimized Solution)

public class ContainerWithMostWater{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n");
		int n = sc.nextInt();

		int[] arr = new int[20];
		System.out.println("Enter the values: ");
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}

		int area = maxArea(arr);
		System.out.println("Max Area: " + area);
	}

	public static int maxArea(int[] height)
	{
		int left = 0; 
		int right = height.length - 1;
		int area = 0;

		while(left < right)
		{
			area = Math.max(area, Math.min(height[left], height[right])*(right - left));
			if(height[left] < height[right])
			{
				left++;
			}
			else
				right--;
		}
		return area;
	}
};