package test.oops;

public class BlockDemo {
	
	{
		System.out.println("Hello");
	}
	BlockDemo(){
		System.out.println("Default Constructor");
	}
	BlockDemo(int id){
		System.out.println(id);
	}
	public static void main(String[] args) {
		BlockDemo b=new BlockDemo();
		BlockDemo b1=new BlockDemo(10);
	}
	
	{
		System.out.println("Hiii");
	}

}
