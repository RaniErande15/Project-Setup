package test;

public class LowerCase {
	int display(String input) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isLowerCase(ch)) {
				count++;
			}
		}
		System.out.println("Lower case letters are:"+count);
		return count;
		
	}
	public static void main(String[] args) {
		LowerCase lower=new LowerCase();
		lower.display("ManDar@");
	}

}
