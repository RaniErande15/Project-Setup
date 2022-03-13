package test.oops;

class Super{
	Super(){
		System.out.println("super constructor");
	}
	int x=10;
	void m2() {
		System.out.println("Hello");
	
	}
}
public class SuperClass extends Super {
	
	SuperClass(){
		System.out.println("sub constructor");
	}
	int x=30;
	
	void m1() {
		System.out.println(super.x); //to access super class variable
		super.m2();   //to access super class method
	}
	public static void main(String[] args) {
		SuperClass su=new SuperClass();
		su.m1();
	}

}
