package test.oops;

public class FinalExample {
	final String GST;
	FinalExample(String name){
		this.GST=name;
		System.out.println(GST);
	}
	public static void main(String[] args) {
		FinalExample ex=new FinalExample("12GB5R8");
	}

}
