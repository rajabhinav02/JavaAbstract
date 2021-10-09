package oops;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Abhi");
		hs.add("Raj");
		hs.add("JK");
		hs.add("Bh");
		hs.add("ui");
		hs.add("ui");
		
		System.out.println(hs.contains("Bh"));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		hs.remove("ui");
		

		Iterator<String> m = hs.iterator();
		System.out.println(m.next());
		System.out.println(m.next());
		
		while (m.hasNext()){
			System.out.println(m.next());
		}
		
	}

}
