package Searching;

import java.util.Scanner;

public class FibonacciSearch {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[]{2,3,4,5,6};
		
		sorting(arr);
		
		System.out.println("Enter the Element to search: ");
		int target = sc.nextInt();
		
		int flag = Search(arr, target);
		
		System.out.println(flag);
		sc.close();
	}
	
	public static void sorting(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static int Search(int[] arr, int target)
	{
		//f(n) = f(n-1) + f(n-2)
		//f(0) = 0, f(1) = 1
		//0,1,1,2,3,5,8,13,...
		
		int len = arr.length;
		int a = 0; 
		int b = 1;
		int c =0;
		int m = 0;
		
		while(c < len)
		{
			c = a + b;
			a = b;
			b = c;
			m++;
		}
		
		int index = m-2;
		
		
		return -1;
	}
}
