package enum_statement;

public class Ex1 {

	public static void main(String[] args) {
		

		
		GoodWeek gw = new GoodWeek();
		gw.setMyWeek(EnumWeek.FRIDAY);
		System.out.println("오늘의 요일 :" + gw.getMyWeek());
	}

}

enum EnumWeek {
	MONDAY, TUESDAY, WEDSDAY, THURSDAY, FRIDAY , SATURDAY, SUNDAY
}


class GoodWeek {
	EnumWeek myWeek;
	
	public EnumWeek getMyWeek() {
		return myWeek;
	}
	
	public void setMyWeek(EnumWeek myWeek) {
		this.myWeek = myWeek;
	}
	
	public void printWeek() {
		switch (myWeek) {
		case MONDAY:  System.out.println(("오늘은 월요일 입니다!")); break;
		case TUESDAY: System.out.println(("오늘은 화요일 입니다!")); break;	
		case WEDSDAY: System.out.println(("오늘은 수요일 입니다!")); break;
		case THURSDAY: System.out.println(("오늘은 목요일 입니다!")); break;
		case FRIDAY: System.out.println(("오늘은 금요일 입니다!")); break;
		case SATURDAY: System.out.println(("오늘은 토요일 입니다!")); break;
		case SUNDAY: System.out.println(("오늘은 일요일 입니다!")); break;
		}
	}
}