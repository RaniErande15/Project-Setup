package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 {
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(001, "Rani");
		h.put(002, "Puja");
		h.put(003, "Sameer");
		h.put(004, "Suja");
		System.out.println("Entries:"+h);
		
		//to read individual object
		for(Object o:h.keySet()) {
			System.out.println("Individual keys:"+o);
		}
		
		for(Object o:h.values()) {
			System.out.println("Individual values:"+o);
		}
		
		//Entry interface methods
		for(Map.Entry entry : h.entrySet()) 
		{
			System.out.println("Value:"+entry.getKey()+"  "+entry.getValue());
		}
		
		//Iterator
		Set s=h.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
	}

}
