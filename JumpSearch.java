package Searching;

import java.util.Scanner;

// Time Complexity is O(n^.5)
// Time Complexity of jump search is between linear and Binary Search
public class JumpSearch {

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
		
	// Searching Function
	public static boolean search(int[] arr, int val) {
		int m = 2;
		
		if(arr.length % 2 == 0) {
			m = 1;
		}
		for(int i = 0; m*(i+1) < arr.length; i++) {
			if(arr[m*i] <= val && arr[m*(i+1)] >= val) {
				for(int j = m*i; j<= m*(i+1); j++) {
					if(val == arr[j])
						return true;
				}
			}
		}
		return false;
	}

}