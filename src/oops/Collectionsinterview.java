package oops;

import java.util.ArrayList;

public class Collectionsinterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,2,3,4,5,3,4,7,7,8,9,9,4,7,4,10};
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> bl = new ArrayList<Integer>();
		ArrayList<Integer> cl = new ArrayList<Integer>();
		
		for (int i=0; i < a.length; i++) {
			bl.add(a[i]);
		}
		
		System.out.println(bl);
		
		int j =0;
		while(j<a.length) {
			cl.add(a[j]);
			j++;
		}
		
		System.out.println(cl);
		
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(4);
		al.add(5);
		al.add(9);
		al.add(9);
		al.add(8);
		
		System.out.println(al);
		System.out.println(al.size());
		
	}

}
