package mvpcorejava;
public class MonthsInYear {
	void getmonths(int m) {
		String months="";
		if (m == 1) {
		months = "january :"+m;
		}else if (m == 2){
			months = "february :"+m;
		}else if (m == 3){
			months = "march :"+m;
		}else if (m == 4){
			months = "april :"+m;
		}else if (m == 5){
			months = "may :"+m;
		}else if (m == 6){
			months = "june :"+m;
		}else if (m == 7){
			months = "july :"+m;
		}else if (m == 8){
			months = "august :"+m;
		}else if (m == 9){									
			months = "september :"+m;
		}else if (m == 10){
			months = "october :"+m;
		}else if (m == 11){
			months = "november :"+m;
		}else if (m == 12){
			months = "december :"+m;
		}else
			months ="enter months between 1 to 12";
		System.out.println(months);	
	}
	void getmonth(int p) {
		String month ="";
		switch (p) {
		case 1:
			month ="january :"+p;
			break;
		case 2:
			month ="february :"+p;
			break;
		case 3:
			month ="march :"+p;
			break;
		case 4:
			month ="april :"+p;
			break;
		case 5:
			month ="may :"+p;
			break;
		case 6:
			month ="june :"+p;
			break;
		case 7:
			month ="july :"+p;
			break;
		case 8:
			month ="august :"+p;
			break;
		case 9:
			month ="september :"+p;
			break;
		case 10:
			month ="october :"+p;
			break;
		case 11:
			month ="november :"+p;
			break;
		case 12:
			month ="december :"+p;
			break;
		default :
			month ="enter month between 1 to 12 :"+p;
			break;
		}
		System.out.println(month);
	}
	public static void main(String[] args) {
		MonthsInYear m = new MonthsInYear();
		m.getmonths(12);
		m.getmonths(2);
		MonthsInYear a = new MonthsInYear();
		a.getmonth(5);
		a.getmonth(8);
	}
}
