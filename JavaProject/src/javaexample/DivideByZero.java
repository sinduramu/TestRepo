package javaexample;

public class DivideByZero {
	public static void main(String[] args) {
		//System.out.println(10/0); - this will give you Arithmetic exception
		System.out.println(10.0/0);
		System.out.println(10/0.0);
		System.out.println(10.0/0.0);
		System.out.println(10.23f/0);
		System.out.println(10.4535d/0);
		System.out.println(10.23f/0.0);
		System.out.println(10.4535d/0.0);
		
		System.out.println(0.0/0.0);
		System.out.println(0.0/0);
		System.out.println(0/0.0);
		System.out.println(0/0);// this one will gives you arithmetic exception
	}

}
