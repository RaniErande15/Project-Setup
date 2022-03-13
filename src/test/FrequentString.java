package test;

import java.util.Scanner;

public class FrequentString {
	int display(char ch) {
		int count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println(count);
		return count;
		
	}
	public static void main(String[] args) {
		FrequentString frequent=new FrequentString();
		frequent.display('a');
		
		
	}

}
