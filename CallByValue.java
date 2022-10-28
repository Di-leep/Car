package mvpcorejava;

public class CallByValue {

	 void m1(int a) {
		a = a-2;
		System.out.println("value of m1  :"+a);
	}

	public static void main(String[] args) {
		CallByValue t = new CallByValue();
		int a =10;
		t.m1(a);// to method
		System.out.println("a value in main :"+a);
		

	}

}
