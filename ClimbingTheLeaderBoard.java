import java.util.*;

public class ClimbingTheLeaderBoard {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i= 0; i < n; i++)
        {
            scores[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] alice = new int[m];
        for(int i = 0; i < m; i++)
        {
            alice[i] = sc.nextInt();
        }

        int[] res = solve(scores, alice);

        for (int re : res) System.out.println(re);

        sc.close();
    }

    public static int[] solve(int[] scores, int[] alice)
    {
        List<Integer> map = new ArrayList<>();
        int[] result = new int[alice.length];
        int diff=0,j=0,n=scores.length;

        for(int i=alice.length-1;i>=0;i--){
            while(alice[i] < scores[j] && j<n && i<alice.length){
                if(map.contains(scores[j]))
                    diff++;
                map.add(scores[j]);
                j++;
                //System.out.print(j + " " + diff + " ");
            }
            result[i]= j - diff + 1;
        }

        return result;
    }

}
