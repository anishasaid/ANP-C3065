package com.mymart.dao;
import java.util.LinkedList;
import com.mymart.model.Product;

public class ProductDAO {
	public void getaddProduct() {
		
	}
	public static void main(String []args) {
		LinkedList<Product> listObj =new LinkedList<Product>();
		
		Product productObj1= new Product(1,"HP",50000.00);
		Product productObj12= new Product(2,"Dell",60000.00);
		Product productObj3= new Product(3,"Apple",100000.00);
		
		listObj.add(productObj1);
		 
		
	
	}
}

