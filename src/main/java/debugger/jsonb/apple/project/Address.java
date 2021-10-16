package debugger.jsonb.apple.project;

public class Address {

	private String streetName;
	private String city;
	private String country;
	private int zipcode;

	public Address() { }

	public Address(String streetName, String city, String country, int zipcode) {
		this.streetName = streetName;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", country=" + country + ", zipcode=" + zipcode
				+ "]";
	}

}
