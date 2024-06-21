package javaPackage;

public class Variable8 {
	int b=10; //Global variable
	static int c = 5; //static variable
	
	public static void d() {
		
		int e = 15; //Local variable
		System.out.println(e); // 5
		}
	public void f() {
		int g = 5; //Local variable
		System.out.println(g); //5
	}

	public static void main(String[] args) {
		int a = 6;//Local variable
		System.out.println(a); //6
		
		//static member calling
		
		System.out.println(c); //5
		d(); //5
		System.out.println(Variable8.c);//5
		Variable8.d(); //5
		
		//Non static member calling
		
		Variable8 v8 = new Variable8();
		System.out.println(v8.b);//10
		v8.f(); //5

	}

}
