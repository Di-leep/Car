package mvpcorejava;

public class TestString {
	public static void main(String[] args) {
		String t1 = new String("hello");
		String t2 = new String("hello");
		
		System.out.println(t1);
		System.out.println("equals :"+t1.equals(t2));
		
		String t3 ="hello";
		String t4 ="HELLO";
		String t6 ="hello";
		System.out.println("equals :"+t1.equals(t3));
		System.out.println("equals :"+t2.equals(t4));
		System.out.println("equals :"+t3.equals(t4));
		
		
		System.out.println(t1==t2);
		System.out.println(t2==t3);
		System.out.println(t3==t6);
		System.out.println(t3==t4);
		
      	t3=t3.toUpperCase();
      	t4=t4.toLowerCase();
      	
      	String t5="happy brithday happy";
      	System.out.println(t5.length());
      	
      	int a=t5.indexOf("h");
      	int b=t5.lastIndexOf("  h");
      	System.out.println(a);
      	System.out.println(b);
      	
      	
      	
      	
      	
		
		
	}

}
