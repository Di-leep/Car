package mvpcorejava;

public class Buffer {

	public static void main(String[] args) {
		
		// string buffer
		
		//String address ="No.11"+"Phase :1"+"Ironman Street"+"Avengers"+"Marvel World";
		
		StringBuilder b = new StringBuilder("Thor");
		b.append(" No.11").append(" Phase:1").append(" Ironman street").append(" Avengers Nagar").append(" Marvel World");
		b.insert(0, "hello ");
		System.out.println(b);
		System.out.println("reverse a string : "+b.reverse());
		System.out.println(b.length());
		
		
	}

}
