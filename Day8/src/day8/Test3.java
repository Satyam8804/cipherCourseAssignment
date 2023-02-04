package day8;


class father{
	
	public final String lastName = "obroi";
	public void foodHabit() {
		System.out.println("I like salty");
	}
	
}
class son extends father{
	public void foodHabit() {
		System.out.println("I like sweet");  // here is function overloading
	}
}

public class Test3 {
	public static void main(String[] args) {
		
	}

}
