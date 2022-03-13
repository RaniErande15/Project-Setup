package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		//HashSet object creating
		//	HashSet hs=new HashSet(100);  initial size
		//	HashSet hs=new HashSet(100,0.95);  size,fill ratio/load factor
		//	HashSet<Integer> hs=new HashSet<Integer>();
	
		HashSet set=new HashSet();  
	
		//add elements into hash set
		set.add(100);
		set.add("Welcome");
		set.add(16.4);
		set.add('A');
		set.add(true);
		
		System.out.println("elements:"+set);
		
		set.remove(16.4);
		System.out.println("removing elements:"+set);
		
		//Read data
		//For each
		for(Object o:set) {
			System.out.println("element using for each:"+o);
		}
		
		//using iterator
		Iterator i=set.iterator();
		while(i.hasNext()) {
			System.out.println("Using iterator:"+i.next());
		}
		
		
		//contains()
		System.out.println(set.contains("Welcome"));
		
		System.out.println(set.isEmpty());

	
	}	
	
	

}
