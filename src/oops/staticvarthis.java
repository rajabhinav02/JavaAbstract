package oops;

public class staticvarthis {
	
	String Address;
	String City;
	//String Name = "kl";
	String bill;
	static String Name ="l";
	static int i ;
	/*static {
		String Name ="l0";
		int i = 5 ;
	}*/
	
	
	public staticvarthis(String Address, String City) {
		this.Address = Address;
		this.City = City;
		i++;
		System.out.println(i);
		System.out.println("Congs" +this.Address);
		
	}
	
	public  void getAddress() {
		String Name ="hj";
		//String Address= "kl";
		System.out.println("Address is "+Address + " and Name is in get address "+Name);
	}
	
	public void getName() {
		System.out.println("Address is "+Address + " and Name is "+Name);
		
	}
	
	//static method-- only static varriable can be called
	
	public static void getstaticnname() {
		System.out.println("Name is "+Name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvarthis ac = new staticvarthis("Home", "Pat");
		staticvarthis ac1 = new staticvarthis("Off", "Mat");
		System.out.println(ac.Address);
		
		
		ac.getAddress();
		ac.getName();
		//calling static method--can be called directly using classname
		staticvarthis.getstaticnname();
		ac.getstaticnname();
		System.out.println(ac.Address);
		ac.Address = "lol";
		System.out.println(ac.Address);
	}

}
