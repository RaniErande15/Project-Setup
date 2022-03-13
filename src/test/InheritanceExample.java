package test;

class Inheri{
	int x=10;
	int y=30;
	protected int z=40;
	void m1() {
		System.out.println("M1 method of Inheri class");
	}
	
}

class InheritanceExample extends Inheri {
	int y=50;
	
	void m2() {
		System.out.println("M2 method");
	}
	void m1() {
		System.out.println("M1");
	}
	
	public static void main(String[] args) {
		Inheri inh=new InheritanceExample();
		System.out.println(inh.x);
		System.out.println(inh.y);
		inh.m1();
		
		Inheri in=new Inheri();
		System.out.println(in.z);
		
		//inh.m2();
	}
}

