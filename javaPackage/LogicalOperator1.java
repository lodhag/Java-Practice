package javaPackage;

public class LogicalOperator1 {

	public static void main(String[] args) {
		int a = 10; //Local Variable
		int b = 5; //Local Variable
		int c = 20; //Local Variable
		
		//Logical Operator
		
		System.out.println(a<b && a<c); //false
		
		//Bitwise Operator
		
		System.out.println(a<b & a<c);//false
		
		//Bitwise Operator
		
		System.out.println(a>b & a++ < c);//true
	}

}
