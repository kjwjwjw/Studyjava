package socket_programming;

import java.io.Serializable;

// Person 객체를 네트워크를 통해전송하기 위해 직렬화
// 추상메서드는 없음(= Marker 인터페이스)
public class Person implements Serializable {
	String name;
	int age;
	String jumin;
	
	public Person (String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}

}