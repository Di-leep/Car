package mvpcorejava;

public class Volume extends Area {
  int h;
  void values(int l,int d,int h) {
	  value(l,b);
	  this.h=h;
  }
  int volume() {
	  return area()* h;
  }
  
  public static void main(String[] args) {
	Volume v = new Volume();
	v.values(10, 20, 30);
	int result =v.volume();
	System.out.println(result);
  }
}
