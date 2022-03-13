package test.multithreading;

public class Client {
	public static void main(String[] args) throws InterruptedException {
		Employee1 emp1=new Employee1();
		Employee2 emp2=new Employee2();
		emp1.start();
		emp2.start();
		System.out.println("hello");
		
		
		
		
	}

}
