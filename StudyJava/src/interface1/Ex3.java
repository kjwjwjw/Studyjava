package interface1;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 인터페이스 필요성(장점)
		 * 1. 구현의 강제성 부여 (=통일성)
		 * 	-인터페이스를 상속받은 서브클래스는 반드시 추상메서드를 구현해야한다! (메서드 이름 통일)
		 * 
		 * 2. 모듈 교체의 용이
		 * 	- 부모 타입인 인터페이스 타입을 변수로 사용하여 각 서브클래스를 다룰 경우
		 * 	  특정 서브클래스가 또 추가되더라도 공통 코드의 변경이 필요없이
		 *    새로운 클래스만 정의하게 되면 언제든 인스턴스 교체를 통해 서브클래스를 다룰 수 있음.
		 *    
		 * 3. 상속 관계가 없는 객체끼리의 관계를 부여하여 다형성 활용 가능
		 * 4. 모듈간 독립적 프로그래밍으로 인한 개발 기간 단축
		 * 
		 */
		
		PrintClient pc = new PrintClient();
		pc.setPrinter(new DotPrinter());
		pc.print("Ex3.java");
		
		pc.setPrinter(new InkjetPrinter());
		pc.print("Test3.java");
		
		pc.setPrinter(new LaserPrint());
		pc.print("Ex4.java");
		
	}

}


interface Printer {
	public void print(String fileName);
}

class DotPrinter implements Printer {

	@Override
	public void print(String fileName) {
		System.out.println("DotPrinter로 출력 :" + fileName);
		
	}
		
}
class InkjetPrinter implements Printer {

	@Override
	public void print(String fileName) {
		System.out.println("InkjetPrinter 로 출력" + fileName);
		
	}
	
}

class LaserPrint implements Printer {

	@Override
	public void print(String fileName) {
		System.out.println("LaserPrinter로 출력: "+ fileName);
		
	}
	
}


// --------------------------
class PrintClient {
	// PrintClient 클래스에서 Printer 인터페이스를 전달 받아 프린터를 컨트롤 하는 경우
	private Printer printer;
	
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	
	public void print(String fileName) {
		printer.print(fileName); // 업캐스팅 된 Printer 타입 객체의 print() 메서드 호출
	}
}
