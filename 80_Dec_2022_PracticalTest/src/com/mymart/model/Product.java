package com.mymart.model;

public class Product {
	 int productId;
	 String productName;
	 String ppName;
	 double productPrice;
	 public Product(){
		 
	 }
	 public Product(int pId, String pName,double pPrice) {
		 productId= pId;
		 productName =pName;
		 productPrice=pPrice;
	 }
	  //Setter method 
	 public void setProductId(int pId) {
		 productId = pId;
	 }
	 public void setProductName(String pName) {
		 productName = pName;
	 }
	 public void setProductPrice(double pPrice) {
		 productPrice =  pPrice;
	 }
	  //Getter method
	 public int getProductId() {
		 return productId ;
	 }
	 public String getProductName() {
		  return productName;
	 }
	 public double getProductPrice() {
		return productPrice;
	 }
	 //override toString method
	 public String toString() {
		 return "["+productId+","+productName+","+productPrice+"]";
	 }
	 //overriding equals()
	 public boolean equals(Object obj) {
		 if(this == obj) {
			 return true;
		 }
		return false;
	 }
	 // Hashcode method
	 public int hashCode() {
		 return productId;
	 }
}
