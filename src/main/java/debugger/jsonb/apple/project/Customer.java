package debugger.jsonb.apple.project;

public class Customer {
	
	private int customerId;
	private String name;
	private String emailAddress;
	
	public Customer() { }
	
	public Customer(int customerId, String name, String emailAddress) {
		this.customerId = customerId;
		this.name = name;
		this.emailAddress = emailAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", emailAddress=" + emailAddress + "]";
	}
	

}
