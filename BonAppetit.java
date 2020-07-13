import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BonAppetit {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            arr.add(sc.nextInt());
        }
        int b = sc.nextInt();
        solve(arr, k, b);
        sc.close();
    }

    public static void solve(List<Integer> bill, int k, int b)
    {
        int Anna_bill = 0;
        for(int i = 0; i < bill.size(); i++)
        {
            if(i != k)
                Anna_bill += bill.get(i);
        }
        Anna_bill = Anna_bill / 2;
        int diff = b - Anna_bill;

        if(diff > 0)
            System.out.print(diff);
        else
            System.out.print("Bon Appetit");
    }
}
