package test.oops;

public class StaticBlock {
	
	static
	{
		System.out.println("Static block");
	}
	{
		System.out.println("non static");
	}
	StaticBlock(){
		System.out.println("Default constructor");
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		StaticBlock st=new StaticBlock();
		StaticBlock st1=new StaticBlock();
	}

}
