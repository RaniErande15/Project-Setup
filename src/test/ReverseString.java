package test;

public class ReverseString {
	
	String reverse(String input) {
		String output=" ";
		for(int index=input.length()-1;index>=0;index--){
			output=output+input.charAt(index);
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		ReverseString reverse1=new ReverseString();
		String ans=reverse1.reverse("Rani");
		System.out.println("Reverse:"+ans);
	}

}
