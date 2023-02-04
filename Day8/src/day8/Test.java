package day8;

public class Test {
	
	//this keyword
	int arg = 5;
	
	Test(){
		System.out.println("Hi! I am the default constructor");
	}
	Test(int arg) {
		this();
		this.arg = arg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arg = 10;  //Local variable
		Test obj = new Test(10);
		
		System.out.println(obj.arg);

	}

}
