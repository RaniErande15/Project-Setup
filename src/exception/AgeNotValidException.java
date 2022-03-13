package exception;

public class AgeNotValidException extends Exception {   //If we write check exception then we need to propogate that exception
	void pubEntry(int age) throws AgeNotValidException{
		if(age<18) {
			throw new AgeNotValidException();
		}
		else {
			System.out.println("Welcome sir/Madam");
		}
	}
	public static void main(String[] args) throws AgeNotValidException {
		AgeNotValidException th=new AgeNotValidException();
		th.pubEntry(16);
		
	}

}
