package enum_statement;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * enum(Week) 과 switch ~ case 문을 활용하여
		 * 
		 * 평일이면(월~목) : "하..."
		 * 금요일이면	   : "불금!"
		 * 주말이면		   : "주말!" 출력
		 * 
		 * */
		Week week = Week.SAT;
		
		// switch ~ case 문 활용
		switch (week) {
		case MON:
		case TUE:
		case WED:
		case THU: System.out.println("하..."); break;
		case FRI: System.out.println("불금!"); break;
		case SAT:
		case SUN: System.out.println("주말!"); break;
		}
		
	}
}

enum Week {
	MON, TUE, WED, THU, FRI, SAT, SUN
}

