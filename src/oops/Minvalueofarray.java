package oops;

public class Minvalueofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{42,81,9,78}, {10,67,89,90}, {98,54,21,65}};
		
		int min = a[0][0];
		
		for (int i=0; i< a.length; i++) {
			for (int j=0; j< a[0].length; j++) {
				
				if (a[i][j] < min){
					min = a[i][j];
				}
				
			
				
			}
		}
		System.out.println(min);
	}

}
