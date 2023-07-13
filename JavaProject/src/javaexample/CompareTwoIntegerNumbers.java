package javaexample;

public class CompareTwoIntegerNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=100;
		System.out.println("Normal Method 1");
		if(a==b)
		{
			System.out.println("Both Numbers are equal");
		}
		else
			System.out.println("Both Numbers are not equal");

			
		
		//Compare Two numbers using Integer Cachin
		//Integer Range is -128 to 127. If we are giving beyond the limit then it will result with else condition
		System.out.println("Method 2 - Integer caching within the limit");
		
		Integer num1=100;
		Integer num2=100;
		if(num1==num2)
		{
			System.out.println("Both Numbers are equal");
		}
		else
			System.out.println("Both Numbers are not equal");
		
System.out.println("Method 3 - Integer caching beyond the limit");
		
		Integer num3=200;
		Integer num4=200;
		if(num3==num4)
		{
			System.out.println("Both Numbers are equal");
		}
		else
		{
			System.out.println("Both Numbers are not equal");
		}

	}

}
