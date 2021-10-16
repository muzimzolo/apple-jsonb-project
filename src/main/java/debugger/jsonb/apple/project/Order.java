package debugger.jsonb.apple.project;

import java.time.LocalDate;

public class Order {
	
	private int orderId;
	private OrderDetails orderDetails;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private Customer customer;
	
	public Order() { }
	
	public Order(int orderId, OrderDetails orderDetails, LocalDate orderDate, LocalDate deliveryDate, Customer customer) {
		this.orderId = orderId;
		this.orderDetails = orderDetails;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDetails=" + orderDetails + ", orderDate=" + orderDate
				+ ", deliveryDate=" + deliveryDate + ", customer=" + customer + "]";
	}


}
