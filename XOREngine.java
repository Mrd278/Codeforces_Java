package Contest_Problems;
import java.util.Scanner;

public class XOREngine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double n, q;
        for(int i = 0; i < t; i++)
        {
            n = sc.nextDouble();
            q = sc.nextDouble();
            for(int j = 0; j < q; j++)
            {
                double[] a = new double[(int)n];
                for(int k = 0; k < n; k++)
                {
                    a[k] = sc.nextDouble();
                }
                double p = sc.nextDouble();

                double even = 0;
                double odd = 0;

                for(int k = 0; k < n; k++)
                {
                    String a_bin = dec_to_bin(a[k]);
                    String p_bin = dec_to_bin(p);

                    String res = XOR_CAL(a_bin, p_bin);
                    double count = Count(res);
                    if(count % 2 == 0)
                    {
                        even++;
                    }
                    else
                    {
                        odd++;
                    }
                }
                System.out.println(even + " " + odd);
            }
        }

        //System.out.println(bin_to_dec("0101"));
        //System.out.println(dec_to_bin(5));

        sc.close();
    }

    private static double Count(String res) {
        double count = 0;
        for(int i = 0; i < res.length(); i++)
        {
            if(res.charAt(i) == '1')
            {
                count++;
            }
        }
        return count;
    }

    public static double bin_to_dec(String bin)
    {
        double sum = 0;
        for(int i = 0; i < bin.length(); i++)
        {
            sum += Math.pow(2, bin.length()-1-i)*(bin.charAt(i)-48);
            //System.out.print((int)bin.charAt(i) + " ");
        }
        //System.out.println("bin to dec: " + sum);
        return sum;
    }

    public static String dec_to_bin(double dec)
    {
        return Integer.toBinaryString((int)dec);
    }

    public static String XOR_CAL(String a, String b)
    {
        StringBuilder res = new StringBuilder();
        if(a.length() > b.length())
        {
            for(int i = 0; i < b.length(); i++)
            {
                if(a.charAt(i) == b.charAt(i))
                {
                    res.append("0");
                }
                else
                {
                    res.append("1");
                }
            }
            for(int i = 0; i < (a.length() - b.length()); i++)
            {
                if(a.charAt(b.length() + i) == 0)
                {
                    res.append("0");
                }
                else
                {
                    res.append("1");
                }
            }

        }
        else
        {
            for(int i = 0; i < a.length(); i++)
            {
                if(a.charAt(i) == b.charAt(i))
                {
                    res.append("0");
                }
                else
                {
                    res.append("1");
                }
            }
            for(int i = 0; i < (b.length() - a.length()); i++)
            {
                if(b.charAt(a.length() + i) == 0)
                {
                    res.append("0");
                }
                else
                {
                    res.append("1");
                }
            }

        }
        return res.toString();
    }
}
