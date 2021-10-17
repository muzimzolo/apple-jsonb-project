package debugger.jsonb.apple.project;

import java.util.*;

import javax.json.bind.annotation.JsonbCreator;
import javax.json.bind.annotation.JsonbProperty;

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
	
	// Custom constructor to enforce certain fields show in our deserialization process
	@JsonbCreator
	public OrderDetails(@JsonbProperty("products") List<Product> products, @JsonbProperty("city") String city,
			@JsonbProperty("country") String country, @JsonbProperty("street") String street,
			@JsonbProperty("zipcode") int zipcode, @JsonbProperty("totalAmount") double totalAmount) {
	    	this.products = products;
		    this.shippingAddress = new Address(street, city, country, zipcode);
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
