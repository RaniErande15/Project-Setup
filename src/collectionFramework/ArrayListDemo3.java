package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		String[] arr= {"Dog","cat","Elephant"};
		for(String st: arr) {
			System.out.println(st);
			
		}
		
		//Convert String array into array list
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);

	}

}
