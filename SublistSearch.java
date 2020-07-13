package Searching;

import datastructures.LinkedList;
import java.util.Scanner;

public class SublistSearch {
	
	public static void main(String[] args) {
		LinkedList List1 = new LinkedList();
		LinkedList List2 = new LinkedList();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of List 1");
		int s1 = sc.nextInt();
		
		System.out.println("Enter the size of List 2");
		int s2 = sc.nextInt();
		
		System.out.println("Enter the elements of List 1");
		for(int i = 0; i < s1; i++)
		{
			int val = sc.nextInt();
			List1.insert(val);
		}
		
		System.out.println("Enter the elements of List 2");
		for(int i = 0; i < s2; i++)
		{
			int val = sc.nextInt();
			List2.insert(val);
		}
		
		List1.show();
		List2.show();
		
		boolean flag = findlist(List1, List2);
		
		if(flag)
			System.out.println("Found");
		else
			System.out.println("Not Found");
		
		sc.close();
	}
	
	public static boolean findlist(LinkedList List1, LinkedList List2)
	{	
		int[] arr1 = List1.array_converter();
		int[] arr2 = List2.array_converter();
		
		for(int i = 0; i < List2.size(); i++)
		{
			if(arr2[i] == arr1[0])
			{
				int k = i;
				int c = 0;
				for(int j = 0; j < List1.size(); j++)
				{
					if(arr2[k++] == arr1[j])
						c++;
				}
				if(c == List1.size())
					return true;
			}
		}
		return false;
	}
}
