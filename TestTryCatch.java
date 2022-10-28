package mvpcorejava;

public class TestTryCatch {

	public static void main(String[] args) {
		try {
			try {
				int a = 100/0;
				System.out.println("A is --->"+a);
				}catch(ArithmeticException e){
					System.out.println("expetion----> "+e);
				}
		}catch(RuntimeException p) {
			System.out.println("failure enter correct number-->"+p);
			System.out.println(p.getMessage());
		}
		System.out.println("hello");
	

	}

}
