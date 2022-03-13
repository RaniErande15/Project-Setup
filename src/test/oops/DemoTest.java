package test.oops;

public class DemoTest implements InterfaceDemo{
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		DemoTest demo=new DemoTest();
		demo.m1();
		System.out.println(InterfaceDemo.x);
		int y=x;
		System.out.println(y);
	}

}
