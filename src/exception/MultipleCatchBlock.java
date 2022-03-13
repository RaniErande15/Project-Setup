package exception;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			System.out.println("Hello try block");
			int x=10/0;
			System.out.println(x);
			System.out.println("in try block");
		}
		catch(NullPointerException e) { 
			System.out.println("Exception cought");
		}
		catch(ArithmeticException ar) {
			System.out.println("Arithmetic block");
		}
		catch(Exception ex) {
			System.out.println("Hello Rani");
		}
		System.out.println("Hi");
	}

}
