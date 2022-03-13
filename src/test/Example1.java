package test;

public class Example1 {
	public static void main(String[] args) {
	int x=5;
	int y=7;
	y=x++ + y++ ;
	int z=x+y;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	}

}
