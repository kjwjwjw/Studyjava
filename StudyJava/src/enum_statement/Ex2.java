package enum_statement;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * enum 객체의 메서드
		 * - enum 타입들은 모두 java.lang.Enum 클래스를 암묵적으로 상속받음
		 *   => 따라서, Enum 클래스에 정의된 메서드 활용 가능
		 * */
		Ex2 ex2 = new Ex2();
		ex2.compareEnum(Season.SUMMER);
		
	}
	
	public void compareEnum(Season season) { // enum 타입(Season타입) 객체(season)를 전달받음
//		System.out.println(season.compareTo(Season.WINTER)); 
		// => season 객체의 ordinal 값 - 파라미터로 전달된 상수의 ordinal 값 결과 리턴
		
		System.out.println(season.name() + " : " + season.ordinal());
		
		if(season == Season.SPRING) {
			System.out.println("따뜻한 봄이네요!");
		} else if(season.equals(Season.SUMMER)) {
			System.out.println("더운 여름입니다!");
		} else if(season.compareTo(Season.WINTER) >= -1) {
			// ex) season(FALL(2)) - Season.WINTER(3) = -1
			// ex) season(WINTER(3)) - Season.WINTER(3) = 0
			System.out.println("점점 추워지는 계절(가을 또는 겨울) 입니다!");
		}
		
		
	}
	
	

}

// enum 타입 Season 정의
// => 상수: SPRING, SUMMER, FALL, WINTER
enum Season {
	// enum 타입 내의 상수는 자동으로 ordinal 값(순서번호)이 부여됨(0부터 자동 부여)
	SPRING,	// ordinal : 0
	SUMMER,	// ordinal : 1
	FALL,	// ordinal : 2
	WINTER	// ordinal : 3
}
