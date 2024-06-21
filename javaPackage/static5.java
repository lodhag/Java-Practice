package javaPackage;

public class static5 {
	static int z = 5; //static variable
	int y = 1; //Global Variable
	 
	//static method
	public static void a() {
		z=10;
		System.out.println(z);
	}
	
	//Non static Method
	
	public void b() {
		z=15;
		System.out.println(z);//15
		a();
	}

	public static void main(String[] args) {
		a();
		static5 s5 = new static5();
		s5.b();

	}

}
