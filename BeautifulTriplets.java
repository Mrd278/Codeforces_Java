/*Easy Problem 

Algo:
for the triplets just check if they are present in the array or not
if both the triplets are present then count++ otherwise don't
traversing upto arr.length-2 you will get your answer

*/

import java.util.Scanner;
import java.util.Arrays;

public class BeautifulTriplets
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		int answer = solve(arr, d);
		System.out.println(answer);
		sc.close();
	}

	public static int solve(int[] arr, int d)
	{
		int count = 0;
		for(int i = 0; i < arr.length-2; i++)
		{
			if(Arrays.binarySearch(arr, arr[i]+d) > 0 && Arrays.binarySearch(arr, arr[i] + 2*d) > 0)
				count++;
		}
		return count;
	}
}