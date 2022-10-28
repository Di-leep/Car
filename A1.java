package mvpcorejava;



public class A1 {
	void student1(){
		System.out.println("student 1 start");
		A2 a2 = new A2();
	try {
			a2.student2();	
		}catch (RuntimeException re){
			throw re;
		}
	}

}
