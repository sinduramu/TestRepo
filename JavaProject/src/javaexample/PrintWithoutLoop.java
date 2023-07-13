package javaexample;

import java.util.stream.IntStream;

public class PrintWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Method 1 - Using Recursive Function");
		printNum(1);
		System.out.println("Method 2 - Using Java Stream");
		IntStream.range(1, 101).forEach(e->System.out.println(e));
		
	}

	public static void printNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printNum(num);
			
		}
		
	}
}
