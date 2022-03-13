package test;

public class ReverseArray {
	
	String reverse(String input) {
		String output=" ";
		for(int index=input.length()-1;index>=0;index--){
			output=output+input.charAt(index);
		}
		return output;
	}
	String[] reverseArray(String[] input) {
		String[] output=new String[input.length];
		for(int index=0;index<input.length;index++) {
			String out=reverse(input[index]);
			System.out.println(out);
		}
		return output;
	}
	public static void main(String[] args) {
		ReverseArray reverse=new ReverseArray();
		//String ans=reverse.reverse("Rani");
		//System.out.println("Reverse:"+ans);
		String[] input= {"Rani","Puja","Sameer","wELCOME","JAVA"};
		reverse.reverseArray(input);
		
	}

}
