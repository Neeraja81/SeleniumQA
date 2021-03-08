package com.kotac.loan.carloan;

public class Icic implements Rbi
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Icic i= new Icic();
      i.withdrawl();
      i.deposit();
	}

	@Override
	public void withdrawl() {
		// TODO Auto-generated method stub
		System.out.println("I am overriding Withdrawl in Icic");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("I am overriding deposit in Icic");
		
	}

}
