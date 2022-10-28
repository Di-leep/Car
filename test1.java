package mvpcorejava;

public class test1 {

	public static void main(String[] args) {
		// private
		roomspace b = new roomspace();
		b.room(40, 50, 60);
		int u = b.area();
		System.out.println(u);
		// without private 
		roomspace t3 = new roomspace();
		t3.l=50;
		t3.b=30;
		t3.h=20;
		int r5 =t3.area();
		System.out.println(r5);

	}

}
