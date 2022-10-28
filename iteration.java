package mvpcorejava;

public class iteration {

	public static void main(String[] args) {
	//for
		for (int a = 10 ;a<=1000;a+=10) { 
           System.out.println("for "+ a);
		}
	//while loop
		int b = 10;
		while( b <= 1000 ){
			System.out.println("while "+b);
			b+=10;
		}
	//do while 
		int c = 10;
		do {
			System.out.println("do_while "+c);
			c+=10;
		}
		while(c<=1000);	
	}

}
