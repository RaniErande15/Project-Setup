package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDemo1  {
	public static void main(String[] args) {
		//Declare ArrayList:
		//ArrayList<Integer> al=new ArrayList<Integer>();
		//List al=new ArrayList();
		ArrayList a=new ArrayList();
		a.add(9);
		a.add("Rani");
		a.add(10.7);
		a.add('a');
		a.add(true);
		//To print array list element
		System.out.println(a);
		
		//Size of array list
		System.out.println("Size of array list:"+a.size());
		
		//Remove element
		a.remove(1);   //1 is index
		System.out.println("Size of array list after removing:"+a.size());
		
		//insert new element in middle
		a.add(2,"Python");
		System.out.println("After insertion:"+a);
		
		//retrive a specific value
		System.out.println("Specific value of index location is:"+a.get(3));
		
		//replace element
		a.set(1, "Rani");
		System.out.println("After insertion new value:"+a);
		
		//Serach value in array list
		System.out.println(a.contains("Rani"));
		
		//To check empty or not
		System.out.println(a.isEmpty());
		
		//How to read data from ArrayList
		//For loop
		System.out.println("Reading elements using for loop.....");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		//for..each loop
		System.out.println("Reading elements using for..each loop....");
		
		for(Object e:a)
		{
			System.out.println(e);
			
		}
		//iterator
		System.out.println("Reading element using iterator..");
		
		Iterator i=a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
