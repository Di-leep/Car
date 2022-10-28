package mvpcorejava;

public class RunTest implements Runnable{	
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}	
	}
	public static void main(String[] args) {
		RunTest rt = new RunTest();
		Thread t1 = new Thread(rt);
		Thread t2 = new Thread(rt);
		Thread t3 = new Thread(rt);
		Thread t4 = new Thread(rt);
		t1.start();
		t2.start();	
		t3.start();
		t4.start();
	}
}
