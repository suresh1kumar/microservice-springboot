package com.hasmap.app;

public class Product {
	
	private String productId;
	private String productName;
	private String productQunt;
	private String productPrice;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductQunt() {
		return productQunt;
	}
	public void setProductQunt(String productQunt) {
		this.productQunt = productQunt;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	/*@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQunt=" + productQunt
				+ ", productPrice=" + productPrice + "]";
	}*/
	
	public String toString() {
		String s=productPrice +" suresh"+" "+"name";
		return s;
	}
	
	

}
