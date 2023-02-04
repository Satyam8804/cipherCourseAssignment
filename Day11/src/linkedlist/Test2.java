package linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//Task : write a program that accepts groceryItems
		//from user (5 items)
		// make sure no duplicates are added
		// display the products
		
		// arraylist or linkedlist
		
		Scanner sc = new Scanner(System.in);
		ArrayList myList = new ArrayList();
		for(int i=0;i<5;i++) {
			String item = sc.next();
			if(myList.contains(item)) {
				continue;
			}
			myList.add(item);
		}
		System.out.println(myList);
	}

}
