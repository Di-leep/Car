package mvpcorejava;

public class LambdaTest {

	public static void main(String[] args) {
    PradeepTest p = (a,b)->{
    	int c =a+b;
    	return c;
    };
    int v =p.add(10, 220);
    System.out.println("lambda test without return type --->"+v );
	}
}
	