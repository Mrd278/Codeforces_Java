package Searching;

import java.util.Scanner;

// Time Complexity of this Function is N

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[]{1,2,3,4,5,6};
		
		System.out.println("Enter the value to be searched:");
		int val = sc.nextInt();
		
		boolean flag = search(arrs,val);
		
		if(flag) {
			System.out.println("Element Present");
		}
		else
			System.out.println("Element Absent");
		sc.close();
	}
	
	// Search Function
	public static boolean search(int[] arr, int val) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == val) {
				return true;
			}
		}
		return false;
	}

}
