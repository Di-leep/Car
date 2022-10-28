package mvpcorejava;


@MvpInfotech(name="chandra")
public class Area {
	int l,b;
	
	
	void value (int l,int b) {
		this.l=l;
		this.b=b;	
	}
	int area() {
		return l*b;
	}
	public static void main(String[] args) {
		Area a = new Area();
		a.value(10, 20);
		int result = a.area();
		System.out.println(result);
	}
}
