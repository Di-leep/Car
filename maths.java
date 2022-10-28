package mvpcorejava;

public class maths {
	
	//add 
void add(int a , int b , int c) {
	int d = a+b+c;
	System.out.println(d);
}
    //sub
void sub(int a , int b , int c) {
	int d = a-b-c;
	System.out.println(d);
}
    //multiple 
void multiple(int a , int b) {
	int c = a*b;
	System.out.println(c);
}

    //divide
void divide(int a , int b) {
	int c = a / b;
	System.out.println(c);
}

//area
void area(int radius) {
    double pi = 3.142 , area;
    area = pi * radius * radius;
    System.out.println("area of circle ="+area);
}
//area of square
void squarearea(int height) {
    int squarearea = height * height;
    System.out.println(squarearea);
}
//percentage
void percentage(float total_mark ,float mark) {
     float percentage = ( float)((mark/ total_mark) * 100);
     System.out.println("percentage of marks"+percentage);
}

    public static void main(String[] args) {
    	maths m = new maths();
		m.add(30, 40, 56);
		m.sub(200, 10, 30);
		m.multiple(33, 11);
		m.divide(300, 10);
		m.area(5);
		m.percentage(600, 500);
        m.squarearea(13);
	}

}
