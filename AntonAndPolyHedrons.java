import java.util.Scanner;

public class AntonAndPolyHedrons {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        /*  Tetrahedron. Tetrahedron has 4 triangular faces.
            Cube. Cube has 6 square faces.
            Octahedron. Octahedron has 8 triangular faces.
            Dodecahedron. Dodecahedron has 12 pentagonal faces.
            Icosahedron. Icosahedron has 20 triangular faces.  */

        long n = sc.nextLong();
        long Sum = 0;
        for(int i = 0; i < n; i++)
        {
            String str = sc.next();
            Sum += Decode(str);
        }

        System.out.println(Sum);

        sc.close();
    }

    public static int Decode(String str)
    {
        switch (str) {
            case "Tetrahedron":
                return 4;
            case "Cube":
                return 6;
            case "Octahedron":
                return 8;
            case "Dodecahedron":
                return 12;
            case "Icosahedron":
                return 20;
            default:
                throw new IllegalStateException("Unexpected value: " + str);
        }
    }
}
