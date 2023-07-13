package javaexample;

public class LongNumberWithoutL {
	
	public static void main(String[] args) {
		long longNumberWithoutL = 1000*60*60*24*365;
		long longNumberWithL = 1000*60*60*24*365L;
		System.out.println(longNumberWithoutL);//op - 1471228928 (somehow bits are reduced and print this value since we have not used L
		System.out.println(longNumberWithL);//op - 31536000000 - it will show you the real value 
		
		//31536000000 -- 36bits convert decimal to binary
		//11101010111101100010010110000000000
		//max limit of int: 32 bits - 2147483647
		//remove first four bit 1010111101100010010110000000000 . convert bindary to decimal . you will get 1471228928
		// use this link for decimal to binary and binary to decimal conversion 
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
	}

}
