package mvpcorejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPITest {
	
	List<Integer> pradeep(int start,int end){
		List<Integer> p = new ArrayList<>();
		for(int i=start;i<=end;i+=5) {
			p.add(i);
	}
		System.out.println("0 to 10 incresing order--->"+p);
		return p;
	}	
	public static void main(String[] args) {
		StreamAPITest t = new StreamAPITest();
		List<Integer> p = t.pradeep(0, 100);
		
		List<Integer> result = new ArrayList<>();
		for(Integer v :p) {
			if(v > 50) {
				v=v+1;
				result.add(v);
				}
		}	
		System.out.println("normal--->"+result);
		
		List<Integer> r =p.stream().filter(y -> y >35).map(y -> y + 1).collect(Collectors.toList());
		System.out.println("using StreamAPI--->"+r);
		
	}
}
 