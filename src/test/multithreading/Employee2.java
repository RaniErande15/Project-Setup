package test.multithreading;

public class Employee2 extends Thread {
	@Override
	synchronized public void run() {
		m1();
	}

	void m1() {
		for(int index=101;index<=200;index++) {
			System.out.println(index);
		}
	}
}
