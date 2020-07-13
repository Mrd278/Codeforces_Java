import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[(int)sc.nextLong()];
        long k = sc.nextLong();
        long[] queries = new long[(int)sc.nextLong()];
        for(long i = 0; i < a.length; i++)
            a[(int)i] = sc.nextLong();
        for(long j = 0; j < queries.length; j++)
            queries[(int)j] = sc.nextLong();
        long[] result = solve(a, k , queries);
        for (long l : result) System.out.println(l);
        sc.close();
    }

    public static long[] solve(long[] a, long k, long[] queries) {
        long[] res = new long[queries.length];
        for (int i = 0; i < queries.length; i++){
            if (queries[i] - k >= 0)
                res[i] = a[(int) ((queries[i] - k) % a.length)];
            res[i] = a[(int) ((queries[i] - k + a.length) % a.length)];
        }
        return res;
    }
}

/*
Concepts:
[1,2,3]
k -> 2 number of rotations
after rotation we get:
[2,3,1]

queries [0,1,2]
answer -> [4,8]

a(x - k + n)

a(0 - 2 + 3) - a(1 % 3) -> a(1) -> 2
a(1 - 2 + 3) - a(2 % 3) -> a(2) -> 3
a(2 - 2 + 3) - a(3 % 3) -> a(0) -> 1
*/
