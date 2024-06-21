package javaPackage;

public class static7 {
	String a; //Global Variable
	int b; //Global Variable
	
	static int c = 4;//static variable
	
	//static method
	public static void a() {
		System.out.println("Hello Static");
	}

	public static void main(String[] args) {
		static7 s7 = new static7();
		
		s7.a ="selenium";
		s7.b = 1;
		c = 2;
		a();
		System.out.println(s7.a + "  " + s7.b + " " + c);
		int j = 5;
		j=j; //variable initialization with same variable
		System.out.println(j); //5
		
	}

}
