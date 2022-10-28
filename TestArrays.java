package mvpcorejava;
public class TestArrays {
	public static void main(String[] args) {
		String[] movie =new String [10];
		movie[0]= "ironman 1";
		movie[1]="hulk";
		movie[2]="ironman 2";
		movie[3]="Thor";
		movie[4]="The first avenger";
		movie[5]="The avenger";
        System.out.println("1 : "+ movie[0]);
        System.out.println("2 : "+ movie[1]);
        System.out.println("3 : "+ movie[2]);
        System.out.println("4 : "+ movie[3]);
        System.out.println("5 : "+ movie[4]);
        System.out.println("6 : "+ movie[5]);              
        int rollnums[] = new int [10];
        for(int i=0,v = 2022000; i < rollnums.length;i++,v=v+1) {
        rollnums[i]=v;
        System.out.println(rollnums[i]);
        }
        int [] a= {1,2,3,4,5};
        System.out.println(a[3]);        
        //multidimensional array
        int [][] table = new int [3][3];
           table[0][0]= 100;
           table[0][1]= 200;
           table[0][2]= 300;       
           table[1][0]= 400;
           table[1][1]= 500;
           table[1][2]= 600;           
           table[2][0]= 700;
           table[2][1]= 800;
           table[2][2]= 900;           
         System.out.println("row 1 column 1 :"+table[0][0]);
         System.out.println("row 1 column 2 :"+table[0][1]);
         System.out.println("row 1 column 3 :"+table[0][2]);
         System.out.println("row 2 column 1 :"+table[1][0]);
         System.out.println("row 2 column 2 :"+table[1][1]);
         System.out.println("row 2 column 3 :"+table[1][2]);
         System.out.println("row 3 column 1 :"+table[2][0]);
         System.out.println("row 3 column 2 :"+table[2][1]);
         System.out.println("row 3 column 3 :"+table[2][2]);                 
         int [][] b = new int [4][4];
         for (int i=0,v=10;i< b.length;i++,v=v+10){
        	 for(int j=0,t=11;j<b.length;j++,t=t+1) {
        	b[i][j]=v+t;
        	 System.out.print(b[i][j]+" ");
        	 }
        	 System.out.println();
         }    
  	}
}
