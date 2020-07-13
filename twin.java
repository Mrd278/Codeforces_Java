import java.util.Scanner;

import java.util.Arrays;



public class twin

{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		

		for(int i = 0; i < n; i++)

		{

		    arr[i] = sc.nextInt();

		}

		int total_money = sum(arr);

		Arrays.sort(arr);

		int result = divide_money(arr);

		System.out.println(result);

		sc.close();

	}

	

	public static int sum(int[] arr)

	{

	    int sum = 0;


		for (int value : arr) {

			sum += value;

		}

	    return sum;

	}

	

	public static int divide_money(int[] arr)

	{

	    int j = arr.length - 1, i = 0;

	    int money_A = 0, money_B = 0;

	    int total_money = sum(arr);

	    while(money_A <= money_B)

	    {

	        money_A += arr[j--];

	        money_B = total_money - money_A;

	        i++;

	    }

	    //System.out.println("money A: " + money_A + ", money B: " + money_B);

	    return i;

	}

}