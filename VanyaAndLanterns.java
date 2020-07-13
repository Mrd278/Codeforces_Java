import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble(); // Number of Lanterns
        long l = sc.nextLong(); // Length of the street
        double[] coordinates = new double[(int)n];
        double result = 0;

        for(int i = 0; i < n; i++)
        {
            coordinates[i] = sc.nextDouble();
        }

        Arrays.sort(coordinates);

        double max = 0;

        for(int i = 0; i < n-1; i++)
        {   double diff = coordinates[i+1] - coordinates[i];
            if(max < diff)
                max = diff;
        }

        double d1 = coordinates[0];
        double d2 = l - coordinates[(int)(n-1)];
        double d3 = (max / 2.0);

        //System.out.println("d1: " + d1 + " d2: " + d2 + " d3: " + d3);

        result = Double.max(Double.max(d1, d2), d3);

        String d = String.format("%.10f",result);

        System.out.print(d);

        sc.close();
    }
}
