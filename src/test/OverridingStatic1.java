package test;

public class OverridingStatic1 extends OverridingStatic{
	int x=20;
	static void m1() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		OverridingStatic st=new OverridingStatic();
		st.m1();
		
		OverridingStatic1 stc=new OverridingStatic1();
		stc.m1();
		
		OverridingStatic stct=new OverridingStatic1();
		stct.m1();
		
		System.out.println(stct.x);
	}

}
