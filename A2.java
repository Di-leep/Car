package mvpcorejava;

public class A2 {
	void student2() {
		System.out.println("student 2 start");
		A3 a3 =new  A3();
		try {
			a3.student3();
		}catch(RuntimeException re) {
			throw re;
		}
	
	}

}
