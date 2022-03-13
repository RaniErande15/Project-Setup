package exception;

import java.util.Scanner;

public class AgeNotValid{
	public static void main(String[] args) throws AgeNotValidException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age:");
		int num=sc.nextInt();
		if(num<18) {
			throw new AgeNotValidException();
		}
		else {
			System.out.println("Above 18");
		}
	}

}
