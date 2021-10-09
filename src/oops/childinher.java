package oops;

public class childinher extends parentinher {
	int i = 10;
	
	public void cloring() {
		System.out.println("child"+ state);
		System.out.println(super.i);
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		parentinher ph = new parentinher();
		ph.cloring();
		System.out.println(ph.i);
		
		
		parentinher pho = new childinher();
		pho.cloring();
		System.out.println(pho.i);
		
		childinher phop = new childinher();
		System.out.println(phop.i);
	
		
		phop.cloring();
		
		/*childinher phopi = new parentinher();
		System.out.println(phop.i);
		phop.cloring();*/
		
		  
		
	}

}
