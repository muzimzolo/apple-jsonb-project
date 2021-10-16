package debugger.jsonb.apple.project;

import java.util.*;

public class OrderDetails {
	
	private List<Product> products;
	private Address shippingAddress;
	private double totalAmount;
	
	public OrderDetails() { }
	
	public OrderDetails(List<Product> product, Address address, double totalAmount) {
		this.products = product;
		this.shippingAddress = address;
		this.totalAmount = totalAmount;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Address getAddress() {
		return shippingAddress;
	}

	public void setAddress(Address address) {
		this.shippingAddress = address;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "OrderDetails [product=" + products + ", address=" + shippingAddress + ", totalAmount=" + totalAmount + "]";
	}
	

}
