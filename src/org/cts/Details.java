package org.cts;

public class Details {

	public void stuDetails() {
		
		byte b=25;
		System.out.println("student age is "+b);
		
		short s=6360;
		System.out.println("student id is "+s);
		
		int i=852369471;
		System.out.println("student reg no is "+i);
		
		long lo =8667278584l;
		System.out.println("student mob no is "+lo);
		
		float fl=123412.12445213f;
		System.out.println("student percentage is "+fl);
		
		double d=50000.12345678;
		System.out.println("student fees is "+d);
		
		boolean bo=true;
		System.out.println("student lives in chennai "+bo);
		
		char c='@';
		System.out.println("venkatesh "+c+" gmail.com");
		
		String st="greens@123";
		System.out.println(st);
		
		System.out.println("selenium java");
		System.out.println("course added");

	}
	
	public static void main(String[] args) {
		Details d=new Details();
		d.stuDetails();
	}
	
	
	
	
}
