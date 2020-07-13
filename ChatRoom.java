package Codeforces;
import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String str = sc.next();
      int flag = 0;
      for(int i = 0; i < str.length(); i++)
      {
        char ch = str.charAt(i);
        
        if(flag == 0 && ch == 'h')
        {
          flag = 1;
        }
        else if(flag == 1 && ch == 'e')
        {
          flag = 2;
        }
        else if(flag == 2 && ch == 'l')
        {
          flag = 3;
        }
        
        else if(flag == 3 && ch == 'l')
        {
          flag = 4;
        }
        else if(flag == 4 && ch == 'o')
        {
          flag = 5;
        }
      }
      
      if(flag == 5)
      {
        System.out.println("YES");
      }
      
      else
      {
        System.out.println("NO");
      }
      sc.close();
    }
}
