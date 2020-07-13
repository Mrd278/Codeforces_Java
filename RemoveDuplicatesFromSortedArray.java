package CodingAlgorithms;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		solution(arr);
		
		sc.close();
	}
	
	// Time Complexity : O(N)
	public static void solution(int[] arr)
	{
		int a = 1;
		
		System.out.println(arr[0]);
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] != arr[i + 1])
			{
				a++;
				System.out.println(arr[i + 1]);
			}
		}
		
		System.out.println("Number of Distinct values in the Array: " + a);
	}
}
