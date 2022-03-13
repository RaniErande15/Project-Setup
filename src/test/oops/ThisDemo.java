package test.oops;

class ParentClass{
	int a=80;
	ParentClass(){
		System.out.println("hi");
	}
}
public class ThisDemo extends ParentClass {
	int num=10;
	void m1() {
		int num=6;
		System.out.println(this.num);
		System.out.println(num);
	}
	ThisDemo(){
		this(5);
		System.out.println("Default constructor");
	}
	ThisDemo(int a){
		//super();
		System.out.println(super.a);
		System.out.println("Parameterize constructor");
	}
	ThisDemo(String name){
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		ThisDemo t=new ThisDemo();
		ThisDemo t1=new ThisDemo("Rani");
		
		//t.m1();
	}

}
