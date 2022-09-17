package assignment02.Answer2;

public class Customer {
	private String name;
	private String address;
	private Integer date;
	private String product;
	private Integer price;
	private String paymentType;
	
	public Customer(String name, String address, Integer date, String product, Integer price, String paymentType) {
		this.name = name;
		this.address = address;
		this.date = date;
		this.product = product;
		this.price = price;
		this.paymentType = paymentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

}
