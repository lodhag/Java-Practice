package javaPackage;

public class TypeCastingNarrowing {
	
	public static void main(String[] args) {
		double b = 5.9;
		int a = (int) b; //Manual Casting double to int
		System.out.println(b); //5.9
		System.out.println(a); //5
		
		//String to Integer Conversion
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i); //10
		
		//Integer to String
		int z = 5;
		String t = String.valueOf(z);
		System.out.println(t); // 5
		System.out.println(t.length()); //1
	}
}
