package mvpcorejava;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> location = new HashMap<>();
		location.put(1, "chennai");
		location.put(2, "VR mall");
		location.put(3, "Anna Nagar");
		location.put(4, "Madhavaram");
		location.put(5, "Redhills");
		
		//loop -1
		
		Set<Integer> i= location.keySet();
		for(Integer start : i) {
			System.out.println(start);
			String loca= location.get(start);
			System.out.println(loca);
		}
		//loop-2
		
	      Set<Entry<Integer,String>> j=location.entrySet();
		 for(Entry<Integer,String> start1 : j) {
			 System.out.println(start1);
		 }
		
		
		
		/*System.out.println("Destination to home--->"+location);
		System.out.println("total loction keys--->"+location.keySet());
		System.out.println("total location names--->"+location.values());
		System.out.println("it will create dupilcate--->"+location.clone());
		System.out.println("contains by element--->"+location.containsKey(7));
		System.out.println("contains by data--->"+location.containsValue("chennai"));
		System.out.println("it will show the data--->"+location.get(1));
		System.out.println("it will show the class--->"+location.getClass());
		System.out.println(location.getOrDefault(4,null));
		System.out.println("is hashmap is empty--->"+location.isEmpty());
		System.out.println("size of the hashmap--->"+location.size());
		System.out.println("before removing data--->"+location);
		location.remove(2);
		System.out.println("after removing data--->"+location);
		System.out.println("before replacing data--->"+location);
		location.replace(1, "koyambedu");
		System.out.println("after recplacing data--->"+location);
		System.out.println(location.remove(1, "koyambedu"));
		location.clear();
		System.out.println("after clear--->"+location); */
		}
	}


