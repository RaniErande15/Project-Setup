package test.oops;

public class Abstract1 extends Abstract{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hello-it is abstarct method");
	}
	void m2(int number) {
		System.out.println(number);
	}
	public static void main(String[] args) {
		Abstract1 sb=new Abstract1();
		sb.m1();
		sb.m2(10);
	}

}
