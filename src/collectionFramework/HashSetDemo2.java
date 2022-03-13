package collectionFramework;

import java.util.HashSet;

public class HashSetDemo2 {
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		System.out.println("elements from set:"+set);
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(100);
		set1.add(600);
		set1.add(200);
		System.out.println("element from set1:"+set1);
		
		//Union,intersection,difference
		//set.addAll(set1);
		//System.out.println("union:"+set);
		
		//intersection
		//set.retainAll(set1);
		//System.out.println("retain value:"+set);
		
		//difference
		set.removeAll(set1);
		System.out.println("difference value:"+set);
		
		//subset
		System.out.println(set.contains(set1));
		
	}

}
