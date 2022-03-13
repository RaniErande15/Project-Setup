package test.oops;

import test.Parent;

public class Child extends Parent{
	public static void main(String[] args) {
		Parent parent=new Parent();
		System.out.println(parent.d);
		Child child=new Child();
		System.out.println(child.c);
		System.out.println(child.d);
		child.m1();
		
	}
	
}
