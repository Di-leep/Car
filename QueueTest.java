package mvpcorejava;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> bikes = new PriorityQueue<>();
		bikes.add("Hero");
		bikes.add("Honda");
		bikes.add("RE");
		bikes.add("TVS");
		System.out.println(bikes);
		System.out.println("it will show first data--->"+bikes.peek());
		System.out.println("it will remove data--->"+bikes.poll());
		System.out.println( bikes.offer("KTM"));
		System.out.println(bikes);
		bikes.clear();
		System.out.println("after clear--->"+bikes);
         bikes.peek();
         System.out.println("peek value when there is no data in queue--->"+bikes);
         bikes.element();
        System.out.println("elemet will throws expeption when no data in queue--->"+ bikes.element()); 
         
        // bikes.o
	}

}
