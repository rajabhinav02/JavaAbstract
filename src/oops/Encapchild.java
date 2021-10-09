package oops;

public class Encapchild extends EncapParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapParent ep = new EncapParent();
		System.out.println(ep.getAge());
		System.out.println(ep.getName());
		System.out.println(ep.getStreet());
		
		
		
		Encapchild ep1 = new Encapchild();
		System.out.println(ep1.getAge());
		System.out.println(ep1.getName());
		System.out.println(ep1.getStreet());
		ep1.setAge(25);
		
		
		
		
		//ep1.setAge(24);
	}

}
