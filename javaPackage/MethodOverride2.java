package javaPackage;

public class MethodOverride2 extends MethodOverride1{
	public void eat() {
		System.out.println("You are eating");
	}

	public static void main(String[] args) {
		MethodOverride2 mo = new MethodOverride2();
		mo.eat();
	}

}
