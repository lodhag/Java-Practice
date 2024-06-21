package javaPackage;

public class Variable4 {

	public static void main(String[] args) {
		int a[] = { 1,2,3,4,5}; //interger type array
		String b[] = {"John", "Peter" }; //string type array
		
		System.out.println(b[0]); //John
		System.out.println(a[3]); //4
		System.out.println(a[0]); //1
		System.out.println(a[1]); //2
		System.out.println(a[2]); //3
		System.out.println(a[4]); //5
		System.out.println(b[1]); //Peter
		
		Object c[] = {1,2,3,"John", "Peter", 'a', 'b', 3>12}; //Object Array
		
		System.out.println(c[3]); //John
		System.out.println(c[0]); //1
		System.out.println(c[5]); //a
		System.out.println(c[6]); //b
		System.out.println(c[7]); //false
		System.out.println(c[8]); //java.lan.ArrayIndexOutOfBoundsException
	}

}
