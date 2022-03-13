package test;

public class SpecialCharacter {
	int display(String input) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				
			}
			else if(Character.isLetter(ch)) {
				
			}
			else {
				count++;
			}
			
		}
		System.out.println("Count for special symbol is-"+count);
		return count;
		
	}
	public static void main(String[] args) {
		SpecialCharacter special=new SpecialCharacter();
		special.display("M@a1n.d3@r4!-");
	}

}
