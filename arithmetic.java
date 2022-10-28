package mvpcorejava;
public class arithmetic {
	public static void main(String[] args) {
		//input values
		int a = 30;
		int b = 10;
		                            //arithmetic +,-,*,/,%
		int c = a+b;    //add +
		int d = a-b;    //sub -
		int e = a*b;    //multiple *
		int f = a/b;    //divide /
		int g = a%b;    //remainder %
		System.out.println("addition      :"+c);
        System.out.println("subration     :"+d);
        System.out.println("multipliction :"+e);
        System.out.println("division      :"+f);
        System.out.println("remainder     :"+g);
                                         //post fix add (++)
        int z = 12;
        int y = z++;
        System.out.println("              postfix      ");
        System.out.println("postfix(++)");
        System.out.println(y);    //y=12   assign first
        System.out.println(z);    //z=z+1   operator
                                         //post fix sub (--)
        int s = 10;
        int r = s--;
        System.out.println("postfix(--)");
        System.out.println(r);    //r=10 assign first 
        System.out.println(s);    //s=s-1
                                        //per fix (++) add
        int h = 30;
        int i =++h;
        System.out.println("              perfix       ");
        System.out.println("(++)perfix");
        System.out.println(i);    //i=30+1  operator
        System.out.println(h);    //h=31  assign
                                         //per fix (--) sub
        int j = 35;
        int k =--j;
        System.out.println("(--)perfix");
        System.out.println(k);    //k=35-1 operator
        System.out.println(j);    //j=34 assign   
	}
}
