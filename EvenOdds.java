package Codeforces;
import java.util.Scanner;

public class EvenOdds
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long res = 0;
        long half_n = (n+1)/2;
        if( k <= half_n)
            res = 2*k - 1;
        else
            res = 2*(k - half_n);
        System.out.println(res);
        sc.close();
    }
}

/*Algorithm:
long n -> 10
long k -> 3
numbers -> 1 3 5 7 9 2 4 6 8 10
Ans -> 5

n -> even
half_n -> n/2
numbers[k] -> ?
if k <= half_n 
Ans -> 2k -1
else 
Ans -> 2*(k % half_n)

n->odd -> half_n = n / 2 + 1
n -> 1 3 5 7 9 11 2 4 6 8 10
k -> 7
half_n = 5+1
Ans -> 2*(7 % 5) -> 2*(2) = 4

*/