package exception;

public class ThrowsKeyword {
	
	void m2() {
		try {
			m1();
		}catch(ArithmeticException ae) {
			System.out.println("Exception");
		}catch(NullPointerException ne) {
			System.out.println("Hello");
		}catch(Exception e) {
			System.out.println("Hi");
		}
		
	}
	void m1() throws ArithmeticException,Exception,NullPointerException{
		int x=10/0;
		System.out.println(x);
	}
	public static void main(String[] args) {
		ThrowsKeyword th=new ThrowsKeyword();
		th.m2();
	}

}
