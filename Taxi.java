import java.util.Scanner;

public class Taxi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int[] arr = new int[(int)n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int[] numbers = new int[4];
        for(int i = 1; i <= 4; i++)
        {
            numbers[i-1] = Count(arr, i);
        }
        
        int t_taxis = total_taxis(numbers);
        System.out.println(t_taxis);
        sc.close();
    }
    
    public static int Count(int[] arr, int val)
    {
        int count = 0;

        for (int value : arr) {
            if (value == val) {
                count++;
            }
        }
        
        //System.out.println("Count of " + val + ": " + count);
        return count;
    }
    
    public static int total_taxis(int[] numbers)
    {
    	int temp = 0;
    	if(numbers[0] - numbers[2] > 0)
    	{
    		temp = numbers[1]*2 + numbers[0] - numbers[2];
    	}
    	else
    	{
    		temp = numbers[1]*2;
    	}

    	int result = numbers[3] + numbers[2] + (int)((temp + 3)/4);

    	return result;
    }

    /*public static int total_taxis(int[] numbers)
    {
        int taxis = 0;
        
        taxis += numbers[3]; // every group of 4 requires a taxi
        numbers[3] = 0; 

        if(numbers[0] > numbers[2] && numbers[1] > numbers[2])
        {
        	//System.out.println("first:");
        	int pair_of_1 = numbers[0]/2;
        	int remainder_of_1 = numbers[0]%2;

        	// number of group of 1's >= number of 2
        	if(pair_of_1 >= numbers[1])
        	{
        		taxis += numbers[1];
        		pair_of_1 -= numbers[1];
        		numbers[1] = 0;

        		numbers[0] = pair_of_1*2 + remainder_of_1;

        		if(numbers[0] >= numbers[2])
        		{
        			taxis += numbers[2];
        			numbers[0] -= numbers[2];
        			taxis += numbers[0]/4;
        			numbers[0] = (numbers[0]/4)*4;
        			taxis += numbers[0];
        		}
        		else
        		{
        			taxis += numbers[0];
        			numbers[2] -= numbers[0];
        			numbers[0] = 0;
        			taxis += numbers[2];
        		}
        	}

        	// number of 2 > number of 1
        	else
        	{
        		taxis += pair_of_1;
        		numbers[1] -= pair_of_1;
        		taxis += numbers[1]/2;
        		numbers[1] -= (numbers[1]/2)*2;
        		taxis += numbers[1];
        		taxis += numbers[2];
        	}
        }

        else
        {
        	// if number of group of 3 >= group of 1
        	//System.out.println("second:");
	        if(numbers[2] >= numbers[0])
	        {   
	            taxis += numbers[0]; // (3,1) * number of group of 1
	            numbers[2] = numbers[2] - numbers[0]; // remaining groups of 3
	            numbers[0] = 0; // group of single participant is paired
	            
	            taxis += numbers[2]; // remaining group of 3 requires single taxi each

	            taxis += numbers[1]/2;
	            numbers[1] = numbers[1] - (numbers[1]/2)*2;
	            taxis += numbers[1];
	            
	        }
	        else
	        {
	            // number of group of 1 is greater than groups of 3
	            
	            
	            taxis += numbers[2]; // pair (3,1) * number of groups of 3
	            numbers[0] = numbers[0] - numbers[2]; 
	            numbers[2] = 0;
	            
	            int temp_of_1 = numbers[0]/2;
	            int rem_of_1 = numbers[0]%2;
	            // pair of 1 >= group of 2's
	            
	            if(temp_of_1 >= numbers[1])
	            {
	                taxis += numbers[1];
	                temp_of_1 -= numbers[1];
	                numbers[1] = 0;
	                
	                taxis += temp_of_1/2;
	                temp_of_1 -= (temp_of_1/2)*2;
	                if(temp_of_1 * 2 + rem_of_1 <= 4)
	                	taxis += temp_of_1;
	                else
	                	taxis += temp_of_1 + rem_of_1;
	            }
	            
	            // pair of 1 < group of 2's
	            
	            else
	            {
	                taxis += temp_of_1;
	                numbers[1] -= temp_of_1;
	                temp_of_1 = 0;
	                
	                taxis += numbers[1]/2;
	                numbers[1] -= (numbers[1]/2)*2;
	                taxis += numbers[1];
	            }
	        }
        }
        
        return taxis;
    }*/
}