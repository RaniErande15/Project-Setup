package test;

public class Interface8Java implements Interface8 {

	@Override
	public void m1() {
		System.out.println("interface method");
		
	}
	public void m2() {
		System.out.println("Override method");
	}
	public static void main(String[] args) {
		Interface8Java i=new Interface8Java();
		i.m1();
		i.m2();
		Interface8.m3();
	}

}
