package collectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("x");
		ll.add("y");
		ll.add("z");
		ll.add("a");
		ll.add("b");
		
		LinkedList ll_dup=new LinkedList();
		ll_dup.addAll(ll);
		System.out.println("Elements:"+ll_dup);
		
		Collections.sort(ll_dup);
		System.out.println("After sorting:"+ll_dup);
		
		Collections.reverse(ll_dup);
		System.out.println("After reverse:"+ll_dup);
		
		Collections.shuffle(ll_dup);
		System.out.println("After shuffle:"+ll_dup);


	}

}
