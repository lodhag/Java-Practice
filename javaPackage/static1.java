package javaPackage;

public class static1 {
	int x=100; //Global variable
	String s = "Hello Java"; //Global Variable
	static int y = 100; //static variable 
	
	//static Method
	public static void method1() {
		String x = "Hi"; //Local variable
		System.out.println(x); //calling x variable
		}
	//Non static Method
	public void method2() {
		int i = 100;//Local Variable
		System.out.println(i);
		
	}
			

	public static void main(String[] args) {
		static1 s1 = new static1();
		s1.method2();
		method1();
		

	}

}
