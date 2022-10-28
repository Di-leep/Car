package mvpcorejava;

public class ChildHelloTest extends HelloTest {
	
	void m1(int a,int b) {
		int c=a-b;
		System.out.println("heloo"+c);
	}

	public static void main(String[] args) {
		HelloTest ht = new HelloTest();
		ht.m1(30, 40);
		ChildHelloTest ht1 = new ChildHelloTest();
		ht1.m1(30, 10);
		
		
	}

}
