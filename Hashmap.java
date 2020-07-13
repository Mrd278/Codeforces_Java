package datastructures;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<>();
		print(map);
		map.put("Mridul", 10);
		map.put("Sachin", 31);
		System.out.println("Size of map: " + map.size());
		print(map);
		if(map.containsKey("Mridul"))
		{
			Integer a = map.get("Mridul");
			System.out.println("Roll number of Mridul is :" + a);
		}
		map.clear();
		print(map);
	}
	
	public static void print(Map<String, Integer> map)
	{
		if(map.isEmpty())
		{
			System.out.println("Map is Empty");
		}
		else {
			System.out.println(map);
		}
	}
}


