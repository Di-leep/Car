package mvpcorejava;

public class CallByRef {
	int a;
		 void m1() {
			a = a + 15;
			System.out.println("value of m1  :"+a);
		}

		public static void main(String[] args) {
			CallByRef t = new CallByRef();
      t.a=10; // calling instance variable
      t.m1();
       
			System.out.println("a value in main :"+t.a);
			

		}

	}




