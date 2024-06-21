package javaPackage;

public class FirstJavaProgram {

	
		//Double slash is used for comment line
		
		int a=5; //Global Variable 
		static int c = 10; //Static Variable
		
		//main method shortcut - write ma and press cntrl + Space > select main
		
		public static void main(String[] args) {
			
			//shortcut - write syso and press cntrl + space
			
			System.out.println("Hello Friends"); // printing string parameter
			System.out.println("12345");
			System.out.println("Hello Automation Test Engineer");
			System.out.println("Hello Java");
			int b = 5; //Local Variable	
			System.out.println(b);
			aMethod();
			bMethod();
			}

		public static void aMethod() {
			System.out.println("Hello a Method");	
		}
		public static void bMethod() {
			System.out.println("Hello b Method");
		
		}
}
