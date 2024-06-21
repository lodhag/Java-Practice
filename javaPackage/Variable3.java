package javaPackage;

public class Variable3 {
	
	int data = 50; //Global Variable
	static int f = 5; //Static Variable
	
	//pre-defined method - main() method
	public static void main(String[] args) {
		
		int n =5; //Local Variable
		System.out.println(n);
		Variable3 var = new Variable3(); /*calling instance method because we can't call 
		non-static method or user defined non-static method directly to main method*/
		var.a();
		System.out.println(k);
		}
	
	static int k = 7; //static variable


	
	//user defined method
	public void a() {
		int a = 100; //Local Variable
		System.out.println(a);
	}

}
