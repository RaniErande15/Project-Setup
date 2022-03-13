package exception;

public class NestedTryCatch {
	NestedTryCatch ca;
	
	void m1() {
		try {
			//int x=10/0;
			try {
				ca.m1();
			}
			catch(NullPointerException n) {
				System.out.println("Null pointer");
				System.out.println("Hi");
			}
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic ");
		}
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		NestedTryCatch ca=new NestedTryCatch();
		ca.m1();
	}
	}


