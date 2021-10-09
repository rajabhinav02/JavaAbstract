package oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMappractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(14, "Abhi");
		hm.put(15,"Raj");
		hm.put(56, "Dh");
		hm.put(67, "Ar");
		
		Set k =hm.entrySet();
		
		
		Iterator m = k.iterator();
		
		while (m.hasNext()) {
		Map.Entry l = (Map.Entry)m.next();
		System.out.println(l.getKey());
		System.out.println(l.getValue());
		}
		
	}

}
