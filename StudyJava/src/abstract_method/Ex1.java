package abstract_method;

abstract class Animal {
	public void cry() {
		System.out.println("짓다!");
	}
}
class Dog extends Animal {

	@Override
	public void cry() {
		System.out.println("멍멍!");
	}
	
	
	
}

class Cat extends Animal{

	@Override
	public void cry() {
		System.out.println("야옹!");
	}
	
	
	
}

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 추상 메서드 (Abstract Method)
		 * -메서드 구현부(= 바디{})가 없는 메서드 (미완성 메서드)
		 * -메서드의 동작을 기술하는 구현부가 없는 추상메서드는
		 *  실행할 수 있는 코드가 없으므로 외부로부터 호출하면 안됨
		 *  => 따라서, 추상메서드를 갖는 클래스는 "반드시" 추상클래스로 선언되어야 한다!
		 * - 메서드 정의 시 선언부의 접근제한자 뒤에 abstract 키워드를 붙여서 정의
		 *  => abstract 키워드가 붙은 메서드는 추상메서드 이므로 바디{}를 가질 수 없다!
		 *  
		 *  -------------------------------------
		 *  <추상메서드 정의 기본 문법>
		 *  [접근제한자] abstract [리턴타입] 메서드명([매개변수...]);
		 *  
		 * 객체를 생성할 수 없는 클래스
		 * => 따라서, new 연산자를 통해 생성자 호출 불가능
		 * - 추상메서드를 가질 수 있는 클래스
		 *  => 상속받는 서브클래스에서 반드시 오버라이딩 해야한다!
		 *  
		 *  
		 *  < 추상클래스 정의 기본 문법>
		 *  abstract class 클래스명 {
		 *   멤버변수(인스턴스 멤버, 클래스(static)멤버)
		 *   *생성자
		 *   메서드 (abstract 추상 메서드 포함!)
		 *   }
		 */
		
//	AbstractClass ac = new AbstractClass();
	// 추상클래스는 인스턴스 생성이 불가능한 클래스이다!
		
		SubClass sc = new SubClass();
		sc.abstractMethod();
		
		AbstractClass ac = sc;
		ac.abstractMethod();
		}

}

abstract class AbstractClass {
	// 주의 abstract 키워드가 붙은 메서드는 추상 메서드이므로 바디를 가질 수 없다!
//	public abstract void abstractMethod() {
//		System.out.println("일반 메서드!");
//	}

	public abstract void abstractMethod() ;
	// ============
	int a;
	static int b;
	
	public AbstractClass() {} // 생성자
	public void print() {}    // 일반메서드
	public static void print2() {}  // static 메서드
}
	

// 추상클래스를 상속받는 서브클래스 정의
// => 추상클래스는 인스턴스 생성은 불가능하지만 상속은 가능하다!

class SubClass extends AbstractClass {

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
	
 	
	
	
}

abstract class MiddleClass extends AbstractClass {
	
}

class Subclass2 extends MiddleClass {

	@Override
	public void abstractMethod() {
		System.out.println("abstractClass -> Middle -> SubClass2 상속을 통해 구현");
		
	}
	
	
}
