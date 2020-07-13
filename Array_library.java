package datastructures;
import java.util.Arrays;
import java.util.Scanner;

public class Array_library {
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements :");
		for(int i = 0; i<10; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();
		Arrays.parallelSort(arr);
		int index = Arrays.binarySearch(arr, target);
		System.out.println("Sorted Array: ");
		for(int i = 0; i<10; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		if(index < 0)
			System.out.println("Target Value not found!");
		else
			System.out.println("Result: " + index);
		sc.close();
	}
}
