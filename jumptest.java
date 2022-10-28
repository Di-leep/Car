package mvpcorejava;

public class jumptest {
	void jump(int a) {
		System.out.println("a start");
		for(int i=1;i<=a;i++){
			if(i==10) {
		  return;
		}
			System.out.println("the value of i is "+i);
		}
		System.out.println("a break");
	}

	public static void main(String[] args) {
		
		jumptest j = new jumptest();
		j.jump(12);
		
		
	}

}
