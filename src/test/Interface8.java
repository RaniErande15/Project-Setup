package test;

public interface Interface8 {
	void m1();
	
	default void m2() {
		m3();
		System.out.println("Hello");
	}
	static void m3() {
		System.out.println("Static method");
	}

}
