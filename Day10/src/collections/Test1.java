package collections;
import java.util.Vector;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		
		Vector vec = new Vector();
		
		vec.add("texas");
		vec.add("zurich");
		vec.add("newyork");
		
		
		Iterator pointer = vec.iterator();
		
		while(pointer.hasNext()) {
			System.out.println(pointer.next());
		}
				
	}

}
