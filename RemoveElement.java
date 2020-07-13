package CodingAlgorithms;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class RemoveElement {
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
		
		System.out.println("Enter the target value: ");
		int target = sc.nextInt();
		
		solution(arr, target);
		
		sc.close();
	}
	
	public static void solution(int[] arr, int target)
	{
		int index = 1, a = 0;
		List<Integer> indices = new LinkedList<>();
		
		while(index >= 0)
		{
			index = Arrays.binarySearch(arr, target);
			if(index >= 0)
			{
				arr[index] = target - 1;
				indices.add(index);
			}
				
			a++;
		}
		
		int[] new_arr = new int[arr.length - a];
		int j = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(!indices.contains(i))
			{
				new_arr[j++] = arr[i];
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Length: " + (arr.length - a));
	}
}
