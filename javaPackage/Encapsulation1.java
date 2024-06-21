package javaPackage;

public class Encapsulation1 {
	String name; //Global variable
	int b; //Global Variable
	final int c =2; //Final Variable
	
	public void a() {
	// c = 5; //final variable cannot change the value
	}
	
	//final method
	
	final void d() {
		System.out.println("final method");
	}
	
	public void setName(String s) {
		this.name = s; //'this' keyword is used for association
		this.b = 5;
		System.out.println(b);
		System.out.println(c);
	}
	public String getName() {
		return name;
	}
	

}
