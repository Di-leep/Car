package mvpcorejava;

public class CrossCheck {
	static void crossPattern(String name,int num) {
		for(int i=0;i<num;i++) {
			int j=num-1-i;
			for(int k=0;k<num;k++) {
				if(k==i||k==j) 
					System.out.print(name.charAt(k));
				else
					System.out.print(" ");
		}
			System.out.println("");
	}
	}
	public static void main(String[] args) {
		String name="PradeepKumar";
		int num=name.length();
		crossPattern(name,num);
	}
}