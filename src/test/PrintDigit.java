package test;

public class PrintDigit {
	int display() {
		String str="R1a2n3i456";
		int count=0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				count++;
				
			}
		}
		System.out.println("Total number count in String-->"+str +" "+"is=" +count);
		return count;
	}
	public static void main(String[] args) {
		PrintDigit digit =new PrintDigit();
		digit.display();
	}

}
