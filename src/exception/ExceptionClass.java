package exception;

public class ExceptionClass {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			System.out.println("Hello try block");
			int x=10/0;
			System.out.println(x);
			System.out.println("in try block");
		}
		
		catch(ArithmeticException ar) {
			System.out.println("Arithmetic block");
		}
		
		System.out.println("Hi");
	}

}
