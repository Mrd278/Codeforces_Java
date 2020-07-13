import java.util.Scanner;

public class FourSum{
	public static void main(String[] args)
	{
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Target:");
		int target = sc.nextInt();


		ArrayList<List<Integer>> res = foursum(arr, target);
	}

	public List<List<Integer>> foursum(int[] arr, int target)
	{
		ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
		int len = arr.length;
		if(len == 0 || len < 4)
			return res;

		Arrays.sort(arr);

		int max = arr[len - 1];
		if(4*arr[0] > target || 4*max < target)
			return res;

		int i,z;
		for(i = 0; i < len; i++)
		{
			z = arr[i];
			if(i>0 && z == arr[i-1])
				continue;
			if(z + 3*max < target)
				continue;
			if(4*z > target)
				break;
			if(4*z == target)
			{
				if(i + 3 < len && arr[i+3] == z)
					res.add(Arrays.asList(z,z,z,z));
				break;
			}

			threesumforfoursum(arr, target - z, i+1, len - 1, res, z);
		}
		return res;
	}
};