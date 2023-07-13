package seleniumTest;

import java.util.List;

import interfacepack.interOne;

public class InterfaceTest implements interOne {

	public static void main(String[] args) {
		InterfaceTest t1=new InterfaceTest();
		t1.test();
		t1.testOne();
		System.out.println(InterfaceTest.limit);
		
		
	}

	public void test() {
		System.out.println("test");
	}

	public void testOne() {
		System.out.println("test one");
		
		
	}

}
