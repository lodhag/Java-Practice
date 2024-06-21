package javaPackage;

public class Inheritance2 extends Inheritance1{
	String name = "Selenium"; //Global Variable
	
	public static void main(String[] args) {
		Inheritance2 i2 = new Inheritance2();
		System.out.println(i2.name); //selenium
		System.out.println(i2.roll); //5
		
	}

}
