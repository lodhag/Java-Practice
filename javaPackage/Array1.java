package javaPackage;

public class Array1 {

	public static void main(String[] args) {
		
		//Declaring  an array
		
		int a[] = new int[5];
		
		//Printing the length of an array
		
		System.out.println(a.length);
		
		//Print default value of an int array
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//Assigning value to an array
		
		a[0]=65;
		a[1]=99;
		a[2]=5;
		a[3]=10;
		a[4]=6;
		
		//a[5]=85; java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(a[2]); //15
		
	//Print all array elements 
		
		for (int i=0; i<a.length; i++) {
			
			System.out.println(a[i]);
		}
	}
}
