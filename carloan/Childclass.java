package com.kotac.loan.carloan;

public class Childclass extends FirstAbstract {
	public static void main(String[] args) {
		Childclass c= new Childclass();
		c.m1();
		c.m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("I am overriding m2 in childclass");
		
	}


		
	

}
