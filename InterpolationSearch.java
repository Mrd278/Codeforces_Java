package Searching;

import java.util.Scanner;

// Time Complexity O(log log n)
// Better Version of Binary Search
public class InterpolationSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[]{25,65,32,89,78,94,56};
		
		sorting(arrs);
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		}
		
		System.out.println("\nEnter the value to be searched");
		int val = sc.nextInt();
		
		boolean flag = search(arrs, val);
		
		if(flag) {
			System.out.println("Present");
		}
		else
			System.out.println("Absent");
		sc.close();

	}
	
	// Sorting Function
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
	
	// Search Function
	public static boolean search(int arr[], int val) {
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo<=hi) {
			int pos = lo + ((val-arr[lo])*(hi-lo)/(arr[hi]-arr[lo]));
			if(arr[pos] == val)
				return true;
			else if(arr[pos] > val) {
				hi = pos - 1;
			}
			else
				lo = pos + 1;
		}
		return false;
	}

}
