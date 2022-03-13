package test;


class Over{
	void m1(int x,int y) {
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
}
class Overriding extends Over {
	void m1(int a,int b) {
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
	public static void main(String[] args) {
		System.out.println("Example for Dynamic");
		Over over=new Overriding();
		over.m1(10, 20);
		System.out.println("Compile time:");
		Over ov=new Over();
		ov.m1(40, 80);
	}
	
	

}
