package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Test0 {
	public static void main(String[] args) {
		
		
		//LinkedList (Collection FrameWork)
		
		LinkedList myll = new LinkedList();
		
		myll.add("I roman");
		myll.add("Thor");
		myll.add("HUlk");
		myll.add("Loki");
		
//		System.out.println(myll.get(1));
		
		myll.addLast("Shivam");
		myll.add(3, "Raj");
		Iterator it =  myll.iterator();
		
		while(it.hasNext()) {
//			it.remove();
			System.out.println(it.next());
		}
		
		System.out.println("------------------");
		System.out.println("Whos at the top "+myll.peek());
		System.out.println("Hey first one get out "+myll.poll());
		
		
		System.out.println("Whos their standing at the last "+myll.pop());
		System.out.println("------------------");
		
		 it = myll.iterator();
		while(it.hasNext()) {
//			it.remove();
			System.out.println(it.next());
		}
		
	}
}
