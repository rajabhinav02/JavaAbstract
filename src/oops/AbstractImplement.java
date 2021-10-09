package oops;

public class AbstractImplement extends ParentAir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ParentAir pa = new AbstractImplement();
		pa.Engine();
		pa.Safety();
		pa.color();*/
		
		AbstractImplement ai = new AbstractImplement();
		ai.tyre();
		ai.Engine();
		ai.color();
		
	
		
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		
		System.out.println("Color");
		
	}

	public void tyre() {
		System.out.println("Tyre");
	}
}
