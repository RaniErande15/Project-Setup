package exception;

public class UserDefinedException extends ArithmeticException {
	void display(int number) {
		if(number%2!=0) {
			throw new UserDefinedException();
		}
		else {
			System.out.println("Number is even");
		}
	}
	public static void main(String[] args) {
		UserDefinedException ud=new UserDefinedException();
		ud.display(11);
	}

}
