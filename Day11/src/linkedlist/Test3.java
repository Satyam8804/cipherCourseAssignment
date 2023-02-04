package linkedlist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test3 {
	public static void main(String[] args) {
		//HashSet--> Insertion order is not maintained
		
		HashSet mySet = new HashSet();
		
		mySet.add("Blue");
		mySet.add("red");
		mySet.add("orange");
		mySet.add("red");
		mySet.add("green");
		System.out.println(mySet);
		
		//Linked Hashset -> to maintain the order of insertion
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Red");
		lhs.add("Green");
		lhs.add("Blue");
		lhs.add("Red");
//		lhs.add("blue");
		System.out.println(lhs);
		
		//TreeSet--> It doesnt allow null,it sorts the data in ascending order
		
		TreeSet ts = new TreeSet();
		
		ts.add("cat");
		ts.add("ball");
		ts.add("Apple");
//		ts.add(null); doesnt allow null
		System.out.println(ts);
		
	}

}
