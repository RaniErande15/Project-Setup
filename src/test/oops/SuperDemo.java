package test.oops;

class Parent1{
	Parent1(){
		
	}
	Parent1(int num){
		System.out.println(num);
	}
}

public class SuperDemo extends Parent {

	SuperDemo(){
		super(10);
	}
	public static void main(String[] args) {
		SuperDemo su=new SuperDemo();
	}
}
