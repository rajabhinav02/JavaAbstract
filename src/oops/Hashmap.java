package oops;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hashtable <Integer,String> hm = new Hashtable<Integer,String>();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(10, "Abhi");
		hm.put(11, "Raj");
		hm.put(16,  "Dh");
		hm.put(15, "MS");
		hm.put(90, "Yuvi");
		hm.put(89, null);
		hm.put(23, "MS");
		System.out.println(hm);
		//hm.remove(12);
		
		System.out.println(hm.get(15));
		//System.out.println(hm.remove(1, "MS"));
		System.out.println(hm.get(90));
		
		Set m =  hm.entrySet();
		
		Iterator i = m.iterator();
		
		while (i.hasNext()) {
			Map.Entry mp = (Map.Entry)i.next();
		
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}

}
