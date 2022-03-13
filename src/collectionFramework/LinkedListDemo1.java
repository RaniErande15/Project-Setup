package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		//Declare link list
		//LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList ll=new LinkedList();  //heterogeneous data
		
		//Add elements into Linked List
		ll.add("Rani");
		ll.add("Puja");
		ll.add("Sameer");
		ll.add(8);
		ll.add('c');
		ll.add(false);
		System.out.println(ll );
		System.out.println(ll.size());
		
		//Remove
		ll.remove(2);
		System.out.println("After removing :"+ll);
		
		//adding element in middle
		ll.add(2, "Sameer");
		System.out.println("After inserting:"+ll);
		
		//Retriving value
		System.out.println("Element for 2nd position:"+ll.get(2));
		
		//replace value
		ll.set(4, "Suja");
		System.out.println("after replacing:"+ll);
		
		//fetch the value
		System.out.println(ll.contains("Suja"));
		
		//to check empty or not
		System.out.println(ll.isEmpty());
		
		//to read link list data
		
		//for loop
		for(int i=0;i<ll.size();i++) {
			System.out.println("Value in link list:"+ll.get(i));
		}
		
		//for each
		for(Object o:ll) {
			System.out.println("Value in link list using for each.."+o);
		}
		
		//using itrator
		
		Iterator i=ll.iterator();
		while(i.hasNext()) {
			System.out.println("Using iterator:"+i.next());
		}
		
		

	}

}
