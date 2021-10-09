package oops;

import java.util.ArrayList;

public class ArrayListinterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {4,4,5,6,7,8,9,3,6,7,8,9,1,0,10,4,5,6,7,8};	
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for (int i=0; i<a.length; i++) {
			int k = 0;
			
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				
				for (int j=i+1;j<a.length; j++) {
					if (a[i]==a[j]) {
						k++;
					}
				}
				System.out.println(a[i]);
				System.out.println(k);
				if (k==1){
				System.out.println("unique is " +a[i]);	
				}
				
				}
			
	}			
				
}					
			
}