package oops;

public class Multiarrayinterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h[][]= {{67,89,97}, {90,76,23}, {765,89,54}, {87,54,39}};
		
		int min = h[0][0];
		
		int mincolumn =0;
		
		for (int i=0; i<h.length; i++) {
			
			for (int j =0; j< h[0].length; j++) {
				if (h[i][j] < min) {
					
				min = h[i][j];
				mincolumn = j;
			}
				
			}
		}
		int max = h[0][mincolumn];
		int k =0;
		while (k<h.length) {
			if (h[k][mincolumn]> max) {
				max = h[k][mincolumn];
				
			}
			k++;
		}
	 System.out.println(max);	
	}
}
