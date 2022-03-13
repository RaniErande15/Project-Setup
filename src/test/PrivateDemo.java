package test;

class Demo {
	private int x=10;
	String str="Rani";
	
	private void m1() {
		System.out.println("M1 method");
	}
	
	void display() {
		System.out.println(x);
	}
	void print() {
		m1();
		System.out.println(x);
	}

}

class PrivateDemo{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.print();
	}
	
}
