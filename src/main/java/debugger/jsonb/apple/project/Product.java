package debugger.jsonb.apple.project;

public class Product {
	
	private int productId;
	private String name;
	private String category;
	private String shippingAddress;
	private double price;

	public Product() { }
	
	public Product(int productId, String name, String category, String shippingAddress, double price) {
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.shippingAddress = shippingAddress;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", category=" + category + ", shippingAddress="
				+ shippingAddress + ", price=" + price + "]";
	}

}
