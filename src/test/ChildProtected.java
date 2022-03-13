package test;

import test.oops.ParentProtected;

public class ChildProtected extends ParentProtected {
	public static void main(String[] args) {
		ChildProtected c=new ChildProtected();
		System.out.println(c.num);
}

}
