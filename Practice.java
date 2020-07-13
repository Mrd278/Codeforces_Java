import java.io.*;
import java.util.*;
public class Practice{


    public static void main(String[] args) {
        // TODO code application logic here
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        Scanner sc= new Scanner(System.in);
        Product[] obj = new Product[10];
        String n;
        int p;
        int c;
        int q;
        try
        {
            FileOutputStream f = new FileOutputStream ("seq31.txt");
            DataOutputStream fileout= new DataOutputStream (f);
            for(int i=0;i<10;i++)
            {
                System.out.println("Input the Name of Product: ");
                n = br.readLine();
                System.out.println("Input the ID of the Product: ");
                p = sc.nextInt();
                System.out.println("Input the Cost of the Product: ");
                c=sc.nextInt();
                System.out.println("Input the Quantity of the Product: ");
                q=sc.nextInt();
                Product P = new Product(n,p,c,q);
                obj[i]= P;
                fileout.writeChars(obj[i].name);
                fileout.writeInt(obj[i].pid);
                fileout.writeInt(obj[i].cost);
                fileout.writeInt(obj[i].quantity);

            }
            fileout.close();
            FileInputStream f1 = new FileInputStream ("seq31.txt");
            DataInputStream filein = new DataInputStream (f1);

            for(int j=0;j<10;j++)
            {
                System.out.print("Name of Product " + (j+1) + " is : ");
                for (int i = 0; i < obj[j].name.length(); i++)
                {
                    System.out.print("" + filein.readChar());
                }
                System.out.println();
                System.out.print("ID of Product " + (j+1) + " is : ");
                System.out.println(filein.readInt());
                System.out.print("Cost of Product " + (j+1) + " is  : Rs.");
                System.out.println(filein.readInt());
                System.out.print("Available Quantity of Product " + (j+1) + " is : ");
                System.out.println(filein.readInt());
                System.out.println();

            }

        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }

}

class Product
{
    int pid;
    String name;
    int cost;
    int quantity;
    public Product(String n,int p, int c, int q)
    {
        name=n;
        pid=p;
        cost=c;
        quantity=q;
    }

}
