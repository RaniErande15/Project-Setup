package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {  
	public static void main(String[] args) {
		LinkedHashSet ls=new LinkedHashSet();
		ls.add("x");
		ls.add("y");
		ls.add("z");
		ls.add("a");
		ls.add("b");
		System.out.println("element:"+ls);
		
		ls.remove("b");
		System.out.println("after remove:"+ls);
		
		System.out.println("Size is:"+ls.size());
		
		
	}

}
