package collections;

import java.util.ArrayList;

public class Test2 {
	
	public static void main(String[] args) {
		// write a program to ask user if he/she wants to add Item
		// in shopping cart
		// item: product Title and Price
		// total Amount of all Products.
		
		//add More ? y, add More ? add More ? N
		// Total Bill: XX 
		// Products Lists(ascending order)
		
		ArrayList<Product> products = new ArrayList<Product>();
		Product p = new Product();
		Product p = new Product();
		p.title="xmen";
		p.price=333;
		products.add(p);
		
	}
	
	class Product{
		String title;
		int price;
	}

}
