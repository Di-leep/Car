package mvpcorejava;

public class EncapTest {
	
String name;
int roll;
int age;

  void set(String name ,int roll,int age) {
	this.name=name;
	this.roll=roll;
	this.age=age;
}

void get() {
	System.out.println("name --->"+name);
	System.out.println("roll num--->"+roll);
	System.out.println("age --->"+age);
}
public static void main(String[] args) {
	EncapTest et =new EncapTest();
	et.set("pradeep", 2220, 10);
	et.get();
	et.set("hello", 110, 20);
	et.get();
}


}
