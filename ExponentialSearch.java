package Searching;

import java.util.Scanner;

// Time Complexity O(log n)
public class ExponentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[]{23,45,6,7,25,98,78};
		
		System.out.println("Enter the value to be Searched:");
		int val = sc.nextInt();
		
		sorting(arrs);
		
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
	public static boolean search(int[] arr, int val) {
		boolean flag = false;
		if(arr[0] == val)
			return true;
		int i = 1;
		while(i < arr.length && arr[i] <= val) {
			i = i*2;
			flag = Binary(arr,i,val);
		}
		return flag;
	}
	
	// Binary Function
	public static boolean Binary(int[] arr, int n, int val) {
		if(n > arr.length)
			n = arr.length;
		int beg = 0;
		int end = n - 1;
		
		boolean flag = false;
		
		while(beg <= end) {
			int mid = (beg+end)/2;
			if(arr[mid] == val) {
				flag = true;
				break;
			}
			else if(arr[mid] > val) {
				end = mid - 1;
				
			}
			else if(arr[mid] < val) {
				beg = mid + 1;
			}
		}
		return flag;
	}
}
