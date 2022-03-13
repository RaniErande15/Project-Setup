package collectionFramework;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("dog");
		ll.add("cat");
		ll.add("dog");
		ll.add("Horse");
		
		System.out.println(ll);
		
		//add at first position
		ll.addFirst("Tiger");
		
		//add end of the list
		ll.addLast("Elephant");
		System.out.println("After adding:"+ll);
		
		//get first element
		System.out.println("First element:"+ll.getFirst());
		
		//last element
		System.out.println("Last element:"+ll.getLast());
		
		//remove first
		ll.removeFirst();
		System.out.println("Removing first:"+ll);
		
		//remove last
		ll.removeLast();
		System.out.println("Removing last:"+ll);


	}

}
