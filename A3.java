package mvpcorejava;

public class A3 {
	void student3() {
		System.out.println(" student 3 start");
		try {
			String distance = "100";
			String time  = null;
			 if(distance == null ||time == null )
			 {
				throw new RuntimeException("100 meter should be completed before 20 sec ");
			}
		}catch(RuntimeException re) {
			throw re;	
		}
		System.out.println("end");
	}

}
