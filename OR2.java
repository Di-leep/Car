package mvpcorejava;

public class OR2 extends OR{
	
	void multiple (int a ,int b,int c,int d) {
		int e=a+b+c+d;
		super.multiple(a, b, c, d);
			System.out.println(e);
	}
	
	String pradeep(String hi) {
		return hi;
	
		
	}

	public static void main(String[] args) {
		OR2 a = new OR2();
		a.multiple(11, 22, 33, 44);
		
		}

}
