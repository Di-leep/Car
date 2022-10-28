package mvpcorejava;

public class classroom {
	static int classroom;
	String name;
	int age;
	static String country;

	public static void main(String[] args) {
		classroom p1 = new classroom();
		classroom p2 = new classroom();
		classroom p3 = new classroom();
		
		//person 1
		
	p1.classroom = 100 ;
	p1.name = "pradeep" ;
	p1.age = 15 ;
	p1.country = "indian" ;
	
	   //person 2
	p2.name = "arun" ;
	p2.age = 15 ;
	
	   //person 3
	p3.name = "deepak" ;
	p3.age = 16 ;
	
	
System.out.println("Name :"+p1.name);
System.out.println("Age :"+p1.age);
System.out.println("class No :"+p1.classroom);
System.out.println("country :"+p1.country);

  int a = 1200;
  int b = 300;
  int c = a / b;
  System.out.println(c);

	}

}
