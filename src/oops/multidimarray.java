package oops;

public class multidimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a[][] = new int[2][3];
		a[0][0]= 2;
		a[0][1]= 3;
		a[0][2]= 4;
		a[1][0]= 5;
		a[1][1]= 6;
		a[1][2]= 7;*/
	    // initiate multidimensional in one line
		int a[][] = {{2,3,4,8},{5,6,7,9},{10,11,12,13}};
		int b[]= new int[9];
		
		
		System.out.println(a[0][1]);
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for (int i=0; i<a.length; i++) {
			
			for (int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]);
				
			}
			
		}
	}

}
