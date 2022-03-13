package interviewPrograms;

public class PrimeNumber {
	public void checkPrime(int number) {
		boolean flag=true;
		for(int index=2;index<number-1;index++) {
			if(number%index==0) {
				flag=false;
				System.out.println("Number is not prime");
				break;
			}
		}
		if(flag==true) {
			System.out.println("Number is prime");
		}
		
	}
	public static void main(String[] args) {
		PrimeNumber prime=new PrimeNumber();
		prime.checkPrime(13);
	}

}
