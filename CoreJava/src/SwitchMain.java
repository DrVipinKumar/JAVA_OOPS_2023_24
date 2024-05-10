class DayOfWeek{
	void checkDay(int value) {
		switch(value) {
		case 1: System.out.println("Sunday");break;
		case 2: System.out.println("Monday");break;
		case 3: System.out.println("Tuesday");break;
		case 4: System.out.println("Wednesday");break;
		case 5: System.out.println("Thursday");break;
		case 6: System.out.println("Friday");break;
		case 7: System.out.println("Saturday");break;
		default:System.out.println("Not a Day");
		}
	}
	void checkWeekDay(int value) {
		String day="";
	day=switch(value) {
		case 1->"Sunday";
		case 2->"Monday";
		case 3->"Tuesday";
		case 4->"Wednesday";
		case 5->"Thursday";
		case 6->"Friday";
		case 7->"Saturday";
		default->"Not a Day";
		};
		System.out.println(day);
	}
}
public class SwitchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			DayOfWeek dw=new DayOfWeek();
			dw.checkDay(2);
			dw.checkWeekDay(2);
	}

}
