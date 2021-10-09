package oops;

public class multiarrayinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{67,78,86,65},{90,53,58,69},{985,864,765,67}}	;
		
		int min = a[0][0];
		int max = a[0][0];
		int mincolumn = 0;
		
		
		int i=0;
		while(i<a.length) {
			int j = 0;
			while(j<a[0].length) {
				if (a[i][j]<min) {
				mincolumn =j;
				}
				j++;
			}
			i++;
		}
		
		for (int k=0; k< a.length; k++) {
			if (a[k][mincolumn] > max) {
				max= a[k][mincolumn];
			}
		}
		System.out.println("maximum nuber in column is "+ max);
	}
 
}
