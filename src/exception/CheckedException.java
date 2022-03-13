package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	void m1() throws FileNotFoundException {
		System.out.println("Hello");
	}
	void m2() {
		try {
			m1();
			System.out.println("Hi");
		}catch(IOException IE) {
			System.out.println("wELCOME");
		}
	}
	
	public static void main(String[] args){
		CheckedException ce=new CheckedException();
		ce.m2();
		
	}
}
