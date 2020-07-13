import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
public class ChefAndSwaps {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t != 0)
        {
            t--;

            long n = sc.nextLong();
            HashMap<Long, Long> map1 = new HashMap<Long, Long>();
            HashMap<Long, Long> map2 = new HashMap<Long, Long>();
            LinkedList<Long> a = new LinkedList<Long>();
            LinkedList<Long> b = new LinkedList<Long>();

            for(long i = 0; i < n; i++)
            {
                long temp = sc.nextLong();
                a.add(temp);
                if(map1.containsKey(temp))
                {
                    map1.put(temp, (map1.get(temp) + 1)%2);
                    map2.put(temp, map2.get(temp)+1);
                }
                else
                {
                    map1.put(temp, (long) 1);
                    map2.put(temp, (long) 1);
                }
            }

            if(a == b)
                System.out.println("Same");
            else
                System.out.println("Different");
        }
        sc.close();
    }
}
