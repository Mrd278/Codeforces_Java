import java.util.Scanner;

class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n]; //dynamic memory allocation
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[2];

        System.out.println("Enter the target");
        int k = sc.nextInt();

        ans = hashing(arr, k);

        System.out.print("["+ans[0]+", "+arr[1]+"]");

        sc.close();
    }

    public static int[] hashing(int[] nums, int target)
    {
        int[] arr = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i<nums.length; i++)
        {
            Integer val = map.get(target - arr[i]);
            if(val == null)
                map.put(nums[i], i);

            else
            {
                arr[0] = val;
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
};
