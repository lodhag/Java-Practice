package javaPackage;

public class static3 {
	int roll;//Declaring global variable
	String name; //Declaring global variable
	static String college = "IIT Bombay"; //static variable
	
	//constructor
	static3(int r,String n){
		roll = r;
		name = n;
	}
	public void getResult() {
		System.out.println(roll + " " + name + " " + college);

	}

}
