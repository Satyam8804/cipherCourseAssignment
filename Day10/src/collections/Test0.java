package collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0 {
	public static void main(String[] args) {
		
		//Non-generic 
		/*
		ArrayList cart0 = new ArrayList();
		
		List cart1 = new ArrayList();
		
		cart0.add("Apple");
		cart0.add(100);
		cart0.add('c');
		
		// Generic version of ArrayList
		ArrayList<Integer> cart2 = new ArrayList<Integer>();
		
		cart2.add(100);
		cart2.add(800);
		*/
		
		ArrayList<String> states = new ArrayList<String>();
		states.add("california");
		states.add("Alabama");
		states.add("Alaska");
		states.add("Arkansas");
		
		System.out.println("ArrayList: "+states);
		
		//Accessing elements using .get() method
		
		String s = states.get(2);
		System.out.println("I got "+s);
		
		// Write loop for this
		
		System.out.println("ArrayList size "+states.size());
		
		for(int i=0;i<states.size();i++) {
			System.out.println(states.get(i));
		}
		
		//Update Elements using .set() Method
		states.set(1,"India");
		System.out.println("After updation: "+states);
		
		//Removing Elements using .remove() method
		
		String t = states.remove(3);
		System.out.println("State Removed is "+t);
		System.out.println("ArrayList after deletion: "+states);
		
		//Let us sort the List using .sort() Method
		
		states.sort(Comparator.naturalOrder()); //A-Z -> a-z -> 65 99
		System.out.println("After sorting : "+states);
		
		// .contains() Method
		System.out.println("Is NewYork There ? "+states.contains("NewYork"));
		
		//  get index of element using .indexOf()
		System.out.println("India is at "+states.indexOf("India")+" index");
		
		// you can check if list is empty or not using .empty() Method
		System.out.println("Is List Empty ? "+states.isEmpty());
		
		states.removeAll(states);
		System.out.println("Is List Empty ? "+states.isEmpty());
		
		
		
	}

}
