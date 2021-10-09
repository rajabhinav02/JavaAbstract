package oops;

public class accessmodifierparent {
	
	public int i;
	private int z;
	protected int h;
	int f;
	
	private void getprivateMethod() {
		
		System.out.println("aceesmodifierprivate");
	}
	
	public void getpublicmethod() {
		System.out.println("aceessmodifierpublic");
	}

	protected void getprotectedmethod() {
		System.out.println("protected");
	}
	
	void getdefaultmethod() {
		System.out.println("default");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessmodifierparent am = new accessmodifierparent();
		
	}

}
