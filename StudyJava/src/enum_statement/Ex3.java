package enum_statement;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * enum에 속성 추가
		 * 
		 * 1. ordinal은 마치 배열 처럼 0부터 시작한다.
		 *    그리고, ordinal은 정수 데이터 이다.
		 * - 특정 데이터를 지정해 주고 싶다!
		 * 예) 지역번호: (서울: 02, 결기도: 031, 인천: 032, 부산: 051 ...)
		 *     URL: NAVER("https://www.naver.com"),
		 *     		DAUM("https://www.daum.net"),
		 *     		GOOGLE("https://www.google.com")   
		 * 
		 * 2. 시스템 유지보수중 enum의 멤버가 추가되거나 변경된다면?
		 * - 기존 ordinal이 깨질 수 있다.
		 *   => ordinal로 계산하고 있던 모든 로직을 찾아 수정해야한다.
		 *   예) 평일만 관리하고 있었다. (월 화 수 목 금 -> 0, 1, 2, 3, 4)
		 *       주말도 관리해야 할것 같다(일 월 화 수 목 금 토 -> 0, 1, 2, 3, 4, 5, 6)
		 * 
		 * 3. 모두 같은 뜻인데 DB의 테이블마다 다른 데이터로 관리되고 있다.
		 * 예) 학교 데이터 (졸업여부: Y/N)
		 *     공장 생상 관리 데이터 (입고완료여부: 1/0)
		 *     						 (출고완료여부: true/false)
		 *     배민 (결재완료여부: T/F)
		 *     
		 * */
		// 1. 지역번호
		Area 부산 = Area.부산;
		System.out.println(부산.value);
		
		// 2. 사이트
		Site 구글 = Site.GOOGLE;
		System.out.println(구글.url);
		
		// 3. 같은 뜻인데 다른 데이터로 관리되고 있을 경우
		Status s = Status.Y;
		System.out.println(s);
		System.out.println(s.value1);
		System.out.println(s.value2);
		System.out.println(s.value3);
		
		s = Status.N;
		System.out.println(s);
		System.out.println(s.value1);
		System.out.println(s.value2);
		System.out.println(s.value3);
		
		
	}

}

// 1. 특정 데이터를 지정해 주고싶다!
enum Area {
	서울("02"), 경기도("031"), 인천("032"), 부산("051");
	
//	static final Area seoul = new Area("02");
	
	String value;
	Area(String value) {
		this.value = value;
	}
	
}

// 2. 사이트
enum Site {
	NAVER("https://www.naver.com"),
	DAUM("https://www.daum.net"),
	GOOGLE("https://www.google.com");
	
	String url;
	private Site(String url) {
		this.url = url;
	}
}


// 3. 모두 같은 뜻인데 DB의 테이블마다 다른 데이터로 관리되고 있다.
enum Status {
	Y(1, true, "T"), 
	N(0, false, "F");
	
	int value1;
	boolean value2;
	String value3;

	// Alt + Shift + S -> O
	private Status(int value1, boolean value2, String value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	
}









