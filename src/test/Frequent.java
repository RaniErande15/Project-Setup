package test;

public class Frequent {
	
	int display(String name,char ch) {
		int count=0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				count++;
			}
		}
		System.out.println("The character-"+" "+ch+" "+"is repeated-"+count+"times");
		return count;
		}
	void print(String name) {
		for(int index=0;index<name.length();index++) {
			if(index==name.indexOf(name.charAt(index)))
				display(name,name.charAt(index));
			
		}
		
	}
	public static void main(String[] args) {
		Frequent frequent =new Frequent();
		//frequent.display("dhananjay", 'a');
		frequent.print("dhananjay");
	}

}
