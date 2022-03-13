package stringMethods;

public class MethodsOfString {
	public static void main(String[] args) {
		String str="Dhananjay";
		String str1="DHananjay";
		if(str==str1) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println(str.charAt(2));
		String temp=String.valueOf(97);
		System.out.println(temp);
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.indexOf('a'));
		
		System.out.println(str.substring(str.indexOf('D'),str.lastIndexOf('y')+1));
	}

}
