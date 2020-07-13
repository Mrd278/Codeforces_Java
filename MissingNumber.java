package CodingProblems;
import java.util.Scanner;
import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[n - 1];
		
		for(int i = 0; i<n-1; i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.parallelSort(arr);
		op_Find_Number(arr);
		sc.close();
	}
	
	// Calculate the Sum
	public static int Actual_sum(int[] arr)
	{
		int n_ = arr.length + 1;
		//System.out.println("length of array: " + arr.length);
		int sum = (n_* (n_ + 1))/2;
		return sum;
	}
	
	// Time Complexity O(n)
	public static void op_Find_Number(int[] arr)
	{
		int act_sum = Actual_sum(arr);
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		System.out.println("Actual Sum: "+ act_sum + " Sum: " + sum);
		System.out.println("Missing Number: " + (act_sum - sum));
	}
	
	// Time Complexity: O(n)
	public static void Find_Number(int[] arr)
	{
		int missing_number = arr.length + 1;
		
		int j = 1;
		
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i] != j)
			{
				missing_number = j;
			}
			j++;
		}
		
		System.out.println("Missing Number: " + missing_number);
	}
}
