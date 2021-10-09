package oops;

import java.util.ArrayList;

public class Arraylistp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>al = new ArrayList<String>();
		al.add("Abhi");
		al.add("Raj");
		al.add("Dh");
		al.add("Ph");
		al.add("jk");
		
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.contains("DK"));
		System.out.println(al.indexOf("Dh"));
		al.remove(0);
		al.remove("Abhi");
		System.out.println(al);
		System.out.println(al.size());
		
		Object[] obj = al.toArray();
		for (Object ob: obj) {
			System.out.println(ob);
		}
	}

}
