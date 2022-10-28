package mvpcorejava; 
public class marks {
	void getgradeformarks(int m) {
		if (m >=0 && m <35) {
			System.out.println("fail mark :"+m);
		} else if (m >= 35 && m <= 50 ) {
			System.out.println("pass mark :"+m);
		} else if (m >= 50 && m <= 60 ) {
			System.out.println("second class :"+m);
		} else if (m >= 60 && m <= 70 ) {
			System.out.println("first class :"+m);
		} else if (m >= 70 && m <= 100) {
			System.out.println("distinction :"+m);
		} else {
			System.out.println("the entered marks should in between 0 to 100 : "+m);
		}
	}
	public static void main(String[] args) {
    marks m = new marks();
  marks n = new marks();
  n.getgradeformarks(34);
    m.getgradeformarks(50);
    m.getgradeformarks(110);
    m.getgradeformarks(75);
 
	}

}
