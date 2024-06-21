package javaPackage;

public class RelationalOperator1 {

	public static void main(String[] args) {
		int a=300; //Local Variable
		int b=300; //Local Variable
		
		//Number Comparison
		if(a!=b) {
			System.out.println("a is not equal to b");
		}else {
			System.out.println("a is equal to b");
		}
			String p = "HELLO";
			String q = "hello";
			
		// String Comparison - 1st Way - Case Sensitive
		
			if(p==q) {
				System.out.println("p and q is equal for 1st way");
			}else {
				System.out.println("p and q is not equal for 1st way");
			}
		
		//String Comparison - 2nd Way - Case Sensitive
			if(p.equals(q)) {
				System.out.println("p and q is equal for 2nd way");
			}else {
				System.out.println("p and q is not equal for 2nd way");
			}
			//String Comparison - 3rd Way - Not Case Sensitive
			
			if(p.equalsIgnoreCase(q)) {
				System.out.println("p and q is equal for 3rd way");
			}else {
				System.out.println("p and q is not equal for 3rd way");
				}
			}
	}