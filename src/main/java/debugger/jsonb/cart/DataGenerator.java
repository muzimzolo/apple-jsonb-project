package debugger.jsonb.cart;

import debugger.jsonb.apple.project.Address;
import debugger.jsonb.apple.project.Customer;
import debugger.jsonb.apple.project.Order;
import debugger.jsonb.apple.project.OrderDetails;
import debugger.jsonb.apple.project.Product;

import java.time.LocalDate;
import java.util.*;

public class DataGenerator {
	
	/*
	 * Data class to store all the products that the customer adds to cart.
	 * Shipping address, products, customer details and return the order
	 */
	public static Order getData() {
		
		Address address = new Address();
		address.setCity("Johannessburg");
        address.setCountry("South Africa");
        address.setZipcode(1782);
        address.setStreetName("Airdlin Rd, Paulshof");	
        
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iPhone SE", "phones", "Apple Inc.", 9000));
        products.add(new Product(2, "Mac Book Air" ,"laptops", "Apple Inc.", 16999));
        products.add(new Product(3, "iPhone 11", "phones", "Apple Inc.", 11999));
        products.add(new Product(4, "AirPods", "earphones", "Apple Inc.", 3999));
        
        OrderDetails orderDetails = new OrderDetails(products, address, 1763.863);
        
        Customer customer = new Customer(1, "Muzi Debugger", "muzidebugger@gmail.com");
        
        Order order = new Order(1, orderDetails, LocalDate.parse("2021-08-01"), LocalDate.parse("2021-08-10"), customer);
        
        return order;
	}

}
