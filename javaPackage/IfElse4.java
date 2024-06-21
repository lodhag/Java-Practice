package javaPackage;

public class IfElse4 {

	public static void main(String[] args) {
		// to check Nested if statement ( also call box inside box)
		
		int age=25; //local variable
		int weight=55; //local variable
		
		if (age>18) {			//outer if block (outer box)
			if (weight>50) {	//inner if block (inner box)
				System.out.println("Eligible");
			}else {
				System.out.println("Not Elgible");
			}
		}else {
			System.out.println("Age is not greater than 18");
		}

	}

}
