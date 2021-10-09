package oops;

public class EncapParent {

	private String name = "Raj";
	private int age = 22;
	private int street = 4;
	
	public String getName() {
		String name = "Dh";
		System.out.println(name);
		return this.name; //this keyword will return the class level variable
	}
	
	public int getAge() {
		return age;
	}
	
	public int getStreet() {
		return street;
	}
	
	
	public void setName(String newname) {
		name = newname;
		System.out.println("Name is "+name);
	}
	
	public void setAge(int newage) {
		age= newage;
		System.out.println(age);
	}
	
	public void setStreet(int newstreet) {
		street = newstreet;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
