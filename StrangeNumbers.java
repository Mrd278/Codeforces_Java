package Contest_Problems;
import java.util.HashMap;
import java.util.Scanner;

public class StrangeNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        sc.close();
    }

    public static HashMap<Integer, Integer> prime_factors_gen(int n, HashMap<Integer, Integer> hmp)
    {
        HashMap<Integer, Integer> hashmp = new HashMap<>();
        if(n == 1)
            return hashmp;
        else if(n % 2 == 0)
        {
            n = n / 2;
            if(hashmp.containsKey(2))
            {
                hashmp.replace(2,hashmp.get(2) + 1);
            }
            else
            {
                hashmp.put(2,1);
            }
            prime_factors_gen(n, hashmp);
        }

        return hashmp;
    }
}
