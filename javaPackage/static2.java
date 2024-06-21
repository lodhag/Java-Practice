package javaPackage;

public class static2 {
	int roll;//Declaring Global Variable
	String name; //Declaring global variable
	String college;//Declaring global variable
	
	public static void main(String[] args) {
		static2 s2 = new static2();
		
		System.out.println(s2.roll);//0
		System.out.println(s2.name);//null
		System.out.println(s2.college);//null
		
	}

}
