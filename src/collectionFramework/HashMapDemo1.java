package collectionFramework;

import java.util.HashMap;

public class HashMapDemo1 {
	public static void main(String[] args) {
		//HashMap<Integer,String> h=new HashMap<Integer,String>();
		HashMap h=new HashMap();
		//Put the key & value in hashmap
		h.put(101, "Rani");
		h.put(102, "Puja");
		h.put(103, "Sameer");
		h.put(104, "Suja");
		System.out.println(h);
		
		//size
		System.out.println("Size of hash map:"+h.size());
		
		//To return keys
		System.out.println(h.keySet());
		
		//to get value
		System.out.println("Value:"+h.get(101));
		
		//to remove
		h.remove(104);
		System.out.println("record after removing:"+h);
		
		//to check key is present or not
		System.out.println(h.containsKey(101));
		
		//to replace record
		h.replace(103, "Suja");
		System.out.println("after replacing:"+h);
		
		//To return values
		System.out.println("Values:"+h.values());
		
		//to get all entry
		System.out.println("All the entries:"+h.entrySet());
		
		
		
		
	}

}
