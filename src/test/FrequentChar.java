package test;

public class FrequentChar {
	int disply(String name,char ch) {
		int count=0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		FrequentChar frequent=new FrequentChar();
		int count=frequent.disply("Dhananjay",'a');
		System.out.println("Frequent character value is:"+count);
		
	}

	

}
