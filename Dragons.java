import java.util.*;

public class Dragons {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(); // Initial player health
        int n = sc.nextInt(); // Number of Dragons
        int[] x = new int[n]; // Dragon's health
        int[] y = new int[n]; // bonus health
        boolean flag = true;

        for(int i = 0; i < n; i++)
        {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        Object[] indexes = SortedIndexGenerator(x);

        for (Object index : indexes) {
            //System.out.print(indexes[i] + " ");
            if (s <= x[(int) index]) {
                flag = false;
                break;
            } else {
                s += y[(int) index];
            }
        }

        if(flag)
            System.out.print("YES");
        else
            System.out.print("NO");
        sc.close();
    }

    public static Object[] SortedIndexGenerator(int[] array)
    {
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        for(int i = 0; i < array.length; i++) {
            List<Integer> ind = map.get(array[i]);
            if(ind == null){
                ind = new ArrayList<Integer>();
                map.put(array[i], ind);
            }
            ind.add(i);
        }

        // Now flatten the list
        List<Integer> indices = new ArrayList<>();
        for(List<Integer> arr : map.values()) {
            indices.addAll(arr);
        }

        return indices.toArray();
    }
}
