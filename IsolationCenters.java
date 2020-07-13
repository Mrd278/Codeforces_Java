import java.io.*;
import java.util.*;

public class IsolationCenters {

    static class Reader
    {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader()
        {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException
        {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException
        {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1)
            {
                if (c == '\n')
                    break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException
        {
            int ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do
            {
                ret = ret * 10 + c - '0';
            }  while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException
        {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException
        {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');

            if (c == '.')
            {
                while ((c = read()) >= '0' && c <= '9')
                {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException
        {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException
        {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException
        {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) throws IOException
    {
        Reader sc = new Reader();
        long t = sc.nextLong();
        while(t != 0)
        {
            long n = sc.nextLong();
            long q = sc.nextLong();
            List<Character> alpha = new ArrayList<>();
            //int p = 0;
            //int sum = 0;
            //int p = 0;
            //char[] alpha = new char[26];
            String str = sc.readLine();
            long[] answes = new long[(int)q];
            for(int i = 0; i < str.length(); i++)
            {
                if(Collections.binarySearch(alpha,str.charAt(i)) < 0) {
                    alpha.add(str.charAt(i));
                    Collections.sort(alpha);
                }
            }
            /*for(int i = 0; i < alpha.size(); i++)
                System.out.print(alpha.get(i) + " ");*/
            for(int i = 0; i < q; i++)
            {
                long sum = 0;
                //int p = 0;
                //char[] alpha = new char[26];
                long k = sc.nextLong();
                for (char c : alpha) {
                    long res = count(str, c) - k;
                    if (res > 0)
                        sum += res;
                    //System.out.println("c: " + c + " count: " + count(str, c));
                }
                answes[i] = sum;
            }
            for (long answe : answes) {
                System.out.println(answe);
            }
            t--;
        }
    }

    public static long count(String str, char ch)
    {
        long c = 0;
        for(int i = 0; i < str.length(); i++)
        {
            if(ch == str.charAt(i))
                c++;
        }
        return c;
    }
}
