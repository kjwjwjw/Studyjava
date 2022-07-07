package abstract_method;

public class Test2 {
	
	public static void main(String[] args) {
		runner f;
		
		f = new tiger();
		f.run();
		
		f = new horse();
		f.run();
		
		f = new human();
		f.run();
		
		System.out.println("==================");
		
		
		runner [] run = {new tiger(), new horse(), new human()};
		for(runner run1 : run) {
			run1.run();
		}
			
		
		
	}

}

abstract class runner {
	public abstract void run() ;
	
}

class tiger extends runner {
	
	public void run() {
		System.out.println("타이거 달리다");
	}
}

class horse extends runner {
	
	public void run() {
		System.out.println("말 달리다");
	}
}

class human extends runner {
	
	public void run() {
		System.out.println("사람 달리다");
	}
}