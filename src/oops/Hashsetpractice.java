package oops;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(10);
		hs.add(11);
		hs.add(12);
		hs.add(13);
		hs.add(14);
		
		
		
		Iterator<Integer> i = hs.iterator();
		
		while (i.hasNext()) {
		
		System.out.println(i.next());
		
		}
		
		
	}

}
