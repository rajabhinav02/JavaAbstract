package oops;

public class stringpalen {
	
	//String n = "madam";
	static String t ="";
	
	public String getPl(String word) {
		
		for (int i = /*this.n.length()-1;*/ word.length()-1; i>=0; i--) {
			t= t+ word.charAt(i);
			
		}
		System.out.println(t);
		//System.out.println(this.n);
		System.out.println(word);
		
		if (word.equals(t)) {
			System.out.println("matching");
			return "matching";
		}
		else {
			System.out.println("not");
			return "not matching";
		}
		
	  	
	
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stringpalen sp = new stringpalen();
		System.out.println(sp.getPl("mada"));

	}

}
