import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t != 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            //long count = 0;
            /* Naive Approach
            for(long i = a; i <= b; i++)
            {
                if(Math.sqrt((double)i) - (int)Math.sqrt((double)i) == 0)
                    count++;
            }*/

            // Efficient Method
            long answer = (long) (Math.floor((double)Math.sqrt((double)b)) - Math.ceil((double)Math.sqrt((double)a)) + 1);
            System.out.println(answer);
            t--;
        }
        sc.close();

    }
}

/*Theory behind the efficient method is
* a,1,4,9,16,25,.....,b - squares
* ceil(x),1,2,3,4,5,.....,floor(y) - sqrt(squares)
*
* by adding 1 we are counting the last locking element
* */