package mvpcorejava;
public class MayMonthDays {
	void getdays(int d) {
	String day ="";
	if ( d == 1 || d == 8 || d == 15 || d == 22 || d == 29) { 
		day =("sunday :"+d );
	}else if (d == 2 || d == 9 || d == 16 || d == 23 || d == 30) {
		day =("monday :"+d);
	}else if (d == 3 || d == 10 || d == 17 || d == 24 || d == 31) {
		day =("tuesday :"+d);
	}else if (d == 4 || d == 11 || d == 18 || d == 25) {
		day =("wednesday :"+d);
	}else if (d == 5 || d == 12 || d == 19 || d == 26) {
		day =("thursday :"+d);
	}else if (d == 6 || d == 13 || d == 20 || d == 27) {
		day =("friday :"+d);
	}else if (d == 7 || d == 14 || d == 21 || d == 28) {
		day =("saturday :"+d);
	}else {
		day = ("enter date in between 1 to 31");
	}
	System.out.println(day);
	}
	void switchdays(int e) {
		String days ="";
		switch (e) {
		case 1:
			days = ("sunday :"+e);
			break;
		case 2:
			days = ("monday :"+e);
			break;
		case 3:
			days = ("tuesday :"+e);
			break;
		case 4:
			days = ("wednesday :"+e);
			break;
		case 5:
			days = ("thursday :"+e);
			break;
		case 6:
			days = ("firday :"+e);
			break;
		case 7:
			days = ("saturday :"+e);
			break;
		default :
			days =("enter date in between 1 to 7 :"+e);
			break;
		}
		System.out.println(days);
	}
	public static void main(String[] args) {
	//if else
		MayMonthDays d = new MayMonthDays();
		d.getdays(15);
		d.getdays(100);
	//switch
		MayMonthDays e = new MayMonthDays();
		e.switchdays(6);
		e.switchdays(8);	
	}
}