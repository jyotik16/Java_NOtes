package com;

public class MultipleInheritance implements Demo1,Demo2{

	@Override
	public void m1() {
		System.out.println("Multi");
		Demo1.super.m1();
		Demo2.super.m1();
	}

	public static void main(String[] args) {
		Demo1 a = new  MultipleInheritance();
		Demo2 b = new  MultipleInheritance();
		//Demo1.super.m1(); //Cannot used super content in static
		b.m1();
		 MultipleInheritance c =new  MultipleInheritance();
		 c.m1();
	}
}
