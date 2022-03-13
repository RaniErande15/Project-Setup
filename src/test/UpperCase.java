package test;

public class UpperCase {
	
	int display(String input) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isUpperCase(ch)) {
				count++;
			}
		}
		System.out.println("Uppercase letters are:"+count);
		return count;
		
	}
	public static void main(String[] args) {
		UpperCase upper=new UpperCase();
		upper.display("MaNDaR");
	}

}
