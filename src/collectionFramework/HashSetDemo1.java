package collectionFramework;

import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(2);
		h.add(4);
		h.add(8);
		System.out.println("elements:"+h);
		
		//add all
		HashSet<Integer> num=new HashSet<Integer>();
		num.addAll(h);
		num.add(10);
		System.out.println("elements from second hashset:"+num);
		
		
		
	}

}
