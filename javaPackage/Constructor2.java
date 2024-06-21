package javaPackage;

public class Constructor2 {
	int id; //global variable
	String name; //global variable
	String address; //global variable
	
	//default constructor C.0 
	
	Constructor2(){
		System.out.println("Hello Default Constructor");
	}
	
	//Parameterized Constructor
	Constructor2 (int a, String b, String c){
		this.id = a;
		name = b;
		address = c;
	}
	// Non - Static Method
	public void displayInfo() {
		System.out.println(id + " "+ name + " " + address);
	}
	
	public static void main(String[] args) {
		//Default Constructor
		Constructor2 c2  = new Constructor2();
		
		//Parameterized Constructor
		
		Constructor2 c3 = new Constructor2(1, "John", "London" );
		c3.displayInfo();
		
		Constructor2 c4 = new Constructor2(2, "Alex", "London" );
		c4.displayInfo();
	}

}
