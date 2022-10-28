package mvpcorejava;

public class rev {

	public static void main(String[] args) {
	 String str ="pradeep";
	 String rev = "";
	 int len = str.length();
	 for(int i=len-1;i>=0;i--)
	 {
		//kSystem.out.println(i);
		char c = str.charAt(i);
	   rev =rev+c;
	 }
	 System.out.println(rev);

	 int [][] a= new int[2][3];
	 for(int i=0,val=100;i<a.length;i++) {
	  for(int j=0;j<3;j++,val=val+100) {
		  a[i][j]=val;
		  System.out.println(a[i][j]);
		  
	  }
	}

}
	}
