package oops;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l[]= new int[3];
		l[0]= 1;
		l[1]=2;
		l[2]=3;

		int i[] = {1,2,3,4};
		String k[]= {"Raj", "Abhi"};
		String[] lo = {"MS", "CD"};
		System.out.println(lo[1]);
		System.out.println(k[0]);
		for (int j =0; j<i.length; j++) {
		
		System.out.println( i[j]);
	}
		for (int n=0; n<l.length; n++ ) {
			System.out.println(l[n]);
		}
	}
	
}
