package exception;

public class ThrowKeyword {
	void m1(int x) {
		if(x==0) {
			throw new NullPointerException("X value cannot be null");
		}
		else {
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) {
		ThrowKeyword th=new ThrowKeyword();
		th.m1(0);
	}

}
