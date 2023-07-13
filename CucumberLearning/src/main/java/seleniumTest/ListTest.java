package seleniumTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ListTest {

	public static void main(String[] args) {
		
		
		Set<String> str1 = new TreeSet<String>();
		
		List<Integer> int1 = new ArrayList<Integer>();
		str1.add("apple");
		str1.add("orange");
		str1.add("banana");
		str1.add("gova");
		int1.add(10);
		int1.add(20);
		int1.add(30);
		int1.add(40);
		
		Integer intv = int1.get(1);
		
		System.out.println(intv);
		System.out.println("*************");
		
		List<String> ls = new ArrayList<String>();
		ls.addAll(str1);
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
	}

}
