package javaPackage;

public class static6 {
	int x=10; //Global Variable
	static int y = 5; //static variable
	
	//Non static method
	
	public void a() {
		int z = 10; //Local Variable
		System.out.println(z);//10
	}
	static int b = 6;//static variable
	
	//static method
	
	public static void b() {
		int a = 5; //local variable
		System.out.println(a);//15
	}
	public static void main(String[] args) {
		static6 s6 = new static6();
		 s6.a();
		 System.out.println(s6.b);//Not appropriate way
		 System.out.println(s6.b);//Not appropriate way
		 System.out.println(b);//correct way
	}

}
