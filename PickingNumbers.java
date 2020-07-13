import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<>();

		for(int i = 0; i < n; i++)
		{
			a.add(sc.nextInt());
		}

		int result = solve(a);
		System.out.println("Result: " + result);
		sc.close();
	}

	public static int solve(List<Integer> a)
	{
		int count = 1;
		int k = 0;
		int j = 0;
		int max = 0;
		Collections.sort(a);
		int i = j + 1;
		while(i < a.size()) {
			int diff = a.get(i) - a.get(j);
			if (diff > 0 && k == 0)
				k = i;
			if (diff <= 1)
				count++;
			if (diff > 1) {
				if (count > max) {
					max = count;
				}

				j = k;
				k = 0;
				count = 1;
				i = j;
			}
			i++;
		}
		if(count > max)
			max = count;
		return max;
	}
}