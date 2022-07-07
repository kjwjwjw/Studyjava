package abstract_method;

public class Test1 {

	public static void main(String[] args) {
		
				Flyer f;
				f = new Bird();
				f.fly();
				
				f = new SuperMan();
				f.fly();
				
				f = new Airplane();
				f.fly();
				
				System.out.println("--------------");
				
				Flyer[] farr = {new Bird(), new SuperMan(), new Airplane() };
				for(Flyer flyer : farr) {
					flyer.fly();
				}
				
				
	}

}

abstract class Flyer {
	public abstract void fly() ;
		
	}


class Bird extends Flyer {

	@Override
	public  void fly() {
		System.out.println("Bird 비행!");
	}
	
}

class SuperMan extends Flyer {

	@Override
	public void fly() {
		System.out.println("SuperMan 비행!");
	}
	
}

class Airplane extends Flyer {

	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}
	
}

