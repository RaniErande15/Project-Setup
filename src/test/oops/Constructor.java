package test.oops;

public class Constructor {
	int num;
	String str;
	
	Constructor(){
		System.out.println("In default constructor");
	}
	Constructor(int roll, String name){
		num=roll;
		str=name;
		System.out.println(num+","+ name);
	}
	public static void main(String[] args) {
		Constructor con=new Constructor();
		con=new Constructor(1,"rani");
		
	}

}
