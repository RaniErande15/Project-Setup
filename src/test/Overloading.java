package test;

public class Overloading {
	
	void replace(int x,String y) {
		System.out.println(x);
		System.out.println(y);
	}
	void replace(int y, int x) {
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		Overloading over=new Overloading();
		over.replace(10,"Rani");
		over.replace(10, 20);
	}

}
