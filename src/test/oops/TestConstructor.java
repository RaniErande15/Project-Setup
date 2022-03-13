package test.oops;

public class TestConstructor {
	protected int num=50;
	private TestConstructor(){
		System.out.println("Hello");
	}
	protected TestConstructor(int num){
		this();
		System.out.println(this.num);
		System.out.println(num);
	}
	public static void main(String[] args) {
		//TestConstructor test=new TestConstructor();
		TestConstructor	test2=new TestConstructor(10);
	}

}
