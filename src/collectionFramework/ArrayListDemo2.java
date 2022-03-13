package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dup=new ArrayList();
		//To add element from another array list
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		//To remove element from another array list
		al_dup.removeAll(al);
		System.out.println(al_dup);
		System.out.println(al_dup.isEmpty());
		
		//Sort--- Collection.sort()
		System.out.println("Elements in array list:"+al);
		Collections.sort(al);
		System.out.println("Elements in array list after sorting:"+al);
		
		//Collections.sort(al,Collections.reverseOrder());
		Collections.reverse(al);
		System.out.println("Elements in array list after sorting:"+al);
		
		//Shuffling
		Collections.shuffle(al);
		System.out.println("Elements in array list after shuffling:"+al);

		
	}

}
