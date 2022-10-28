package mvpcorejava;

public class overloading {
	
	void multiple(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	int multiple(int a,int b ,int c) {
		int d=a*b*c;
		System.out.println(d);
		return d;
	}
		long multiple(long a) {
			long g=a+a;
			System.out.println(g);
			return g;
		}
		
		String multiple(String Name,String Address) {
			String d = Name+" "+Address; 
			System.out.println("detials of preson :"+d);
			return d;
		}

	public static void main(String[] args) {
		
		overloading o = new overloading();
		o.multiple(10, 20);
		o.multiple(50, 3, 7);
		o.multiple(25);
		o.multiple("Pradeep","Chennai");

	}

	}
