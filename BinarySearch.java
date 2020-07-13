package Searching;
import java.util.Scanner;

// Time Complexity O(Log n)

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrs = new int[]{23,12,56,76,45,87};
		
		System.out.println("Enter the value to be searched:");
		int val = sc.nextInt();
		
		sorting(arrs);
		System.out.println("Sorted Array:");
		for(int i = 0; i<arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		}
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
		int beg = 0;
		int end = arr.length - 1;
		
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
