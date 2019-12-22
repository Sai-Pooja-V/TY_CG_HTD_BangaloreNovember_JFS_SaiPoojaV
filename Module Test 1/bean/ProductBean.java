package com.cg.moduletest.bean;

public class ProductBean {

	private int productId;
	private String productName;
	private int productCost;
	private String productColor;
	private String description;
	private int numberOfProducts;


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductCost() {
		return productCost;
	}
	public void setProductCost(int productCost) {
		this.productCost = productCost;
	}
	public String getProductColor() {
		return productColor;
	}
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumberOfProducts() {
		return numberOfProducts;
	}
	public void setNumberOfProducts(int numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", productColor=" + productColor + ", description=" + description + ", numberOfProducts="
				+ numberOfProducts + "]";
	}


}
