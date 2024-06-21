package javaPackage;

public class MethodOverride4 extends MethodOverride3{
	public void run() {
		System.out.println("you are running");
	}

	public static void main(String[] args) {
		MethodOverride4 mo4 = new MethodOverride4();
		mo4.run();
	 
	
	//Explicitly for MethodOverride3
	MethodOverride3 mo3 = new MethodOverride3();
	mo3.run();
	}
}
/*Here MethodOverride4 over rides MethodOverride3, having same method but 
gives focus to child class where it is called */