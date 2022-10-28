package mvpcorejava;

public class ThrowsTest {
	public static void main(String[] args) {
		
		A1 a1 = new A1();
		try {
			a1.student1();
		}catch (RuntimeException re) {
			System.out.println("slections process "+re );	
		}
    System.out.println("end main method ");
	}

}
