package mvpcorejava;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
public class SetTest {
	public static void main(String[] args) {
		SortedSet<String> data = new TreeSet<>();
		NavigableSet<Integer> data1 = new TreeSet<>();
		data.add("apple");
		data.add("ball");
		data.add("cat");
		data.add("dog");
		data.add("eyes");
		data.add("fox");
		
		//sortedset
		System.out.println(data);
		System.out.println("first element--->"+data.first());
		System.out.println("last element--->"+data.last());
		System.out.println("size of list--->"+data.size());
		System.out.println("is given data is in list--->"+data.contains("ball"));
		System.out.println("is list is empty--->"+data.isEmpty());
		System.out.println("it will shows element before given element--->"+data.headSet("cat"));
		System.out.println("it will shows element after given element--->"+data.tailSet("cat"));
        System.out.println("it will shows element in between given element---> "+data.subSet("apple", "dog"));
        System.out.println("it will remove the data from list--->"+data.remove("fox"));
        
        //likedhashset
        
        data1.add(10);
        data1.add(20);
        data1.add(30);
        data1.add(40);
        data1.add(50);
        data1.add(60);
        data1.add(70);
        System.out.println(data1);
        System.out.println(data1.ceiling(39));
        System.out.println(data1.floor(59));
        NavigableSet<Integer> result =data1.descendingSet();
        System.out.println("high to low"+ result);
        
        
       
        
	}

}
