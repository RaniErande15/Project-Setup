package test;

public class SumOfChar {
	int display(String input) {
		int sum=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch))
			sum=sum+Character.getNumericValue(ch);
		}
		System.out.println("Sum of numbers:"+sum);
		return sum;
		
	}
	public static void main(String[] args) {
		SumOfChar sum=new SumOfChar();
		sum.display("M123@ndar34");
	}

}
