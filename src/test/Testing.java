package test;

import oops.ParentAir;

public class Testing extends ParentAir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentAir pa = new Testing();
		pa.color();
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("haha");
	}

}
