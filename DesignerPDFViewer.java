import java.util.Arrays;
import java.util.Scanner;

public class DesignerPDFViewer {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] height = new int[26];
        for(int i = 0; i < 26; i++)
        {
            height[i] = sc.nextInt();
        }
        String str = sc.next();

        int res = solve(height, str);
        System.out.println("Result: " + res);
        sc.close();
    }

    public static int solve(int[] h, String word)
    {
        int res;
        int[] arr = new int[word.length()];
        for(int i = 0; i < word.length(); i++)
        {
            arr[i] = h[(int)word.charAt(i) - 97];
        }

        Arrays.sort(arr);
        res = word.length() * arr[word.length() - 1];
        return res;
    }
}
