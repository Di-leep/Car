package mvpcorejava;

public class roomspace {
 private  int l,b,h;
   void room(int lenght , int breath , int height ) {
	   l = lenght;
	   b = breath;
	   h = height;
   }
   int area() {
	 int a = l*b;
	 return a;
	}
   int volume() {
	   int v = l*b*h;
	   return v;
   }
	public static void main(String[] args) {	
		roomspace t3 = new roomspace();
		t3.l=50;
		t3.b=30;
		t3.h=20;
		int r5 =t3.area();
		System.out.println(r5);
		
		roomspace t = new roomspace();
		t.room(30, 40, 50);
		roomspace t1 = new roomspace();
		t1.room(40, 20, 30);
		//class 1
		System.out.println(" class 1");
		int r1 =t.area();
		System.out.println("area of c1 : "+r1);
		int r2 =t.volume();
		System.out.println("volume of c1 : "+r2);
		//class 2
		System.out.println(" class 2");
		int r3 =t1.area();
		System.out.println("area of c2 : "+r3);
		int r4 =t1.volume();
		System.out.println("volume of c2 : "+r4);

	}

}
