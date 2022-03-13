package test.oops;

class Parent{
	Parent(int num){
		System.out.println(num);
	}
}
public class ChildClass extends Parent {
	ChildClass()
	{
		super(10);
		System.out.println("Child class constructor");
	}
	public static void main(String[] args) {
		ChildClass chi=new ChildClass();
	}

}
