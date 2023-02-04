package day8;

class App {
	App(){
	System.out.println("Constructor of App");
	}
	
	App(int num){
		System.out.println(num);
	}
}

public class Test2 extends App{
	
	Test2(){
		super(20);
		System.out.println("Constructor of Test2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Test2();  
	}

}

// if u call constructor of derived class then the first constructor
// to be called will be constructor of Base and then derived.