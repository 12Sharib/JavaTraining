package assignment02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Customer{
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

public class Answer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Customer> list = new ArrayList<Customer>();
		
		list.add(new Customer("Rajan Patil", "Aundh", 1, "Phone Cover", 170, "Cash"));
		list.add(new Customer( "Gupta", "Baner", 1, "Samsung Battery", 900, "Credit Card"));
		list.add(new Customer(" Patil", "Aundh", 3, "Samsung Battery", 1000, "Cash"));
		list.add(new Customer(" Kothari", "Baner", 4, "Earphones", 500, "Credit Card"));
		list.add(new Customer("T Sunitha", "Shivajinagar", 5, "Earphones",550, "Credit Card"));
		list.add(new Customer("Rohan Gade", "Aundh", 10, "Motorola Battery", 1000, "Credit Card"));
		list.add(new Customer("Rajan Patil", "Shivajinagar", 21, "Earphones", 550, "Credit Card"));
		list.add(new Customer("Rajan Patil", "Aundh", 22, "USB Cable",150, "UPI"));
		list.add(new Customer("Meena Kothari", "Baner", 23, "USB Cable",100, "Cash"));
		list.add(new Customer("Nina Kothari", "Baner", 24, "USB Cable",200, "UPI"));
		list.add(new Customer("Mohit Gupta", "Baner", 25, "USB Cable",50, "UPI"));
		
		System.out.print("Enter the productName for find which person buy on discounted price : ");
		String productName = sc.nextLine();
		
		Iterator<Customer> it = list.iterator();
		
		List<Integer> price  = new ArrayList<Integer>();
		
		Integer temp = 0;
		while(it.hasNext()) {
			Customer values = it.next();
			String productNameInList = values.getProduct();
			
			if(productName.equals(productNameInList)) {
				Integer productPrice = values.getPrice();
				temp++;
				price.add(productPrice);
			}
		}
		Integer discountedPrice = price.stream().min(Integer::compare).get();
		
		//System.out.println(discountedPrice);
		
		Iterator<Customer> it2 = list.iterator();
		while(it2.hasNext()) {
			Customer values = it2.next();
			Integer getPriceFromList = values.getPrice();
			
			if(discountedPrice == getPriceFromList) {
				if(temp == 1) {
					System.out.print(values.getName() + " has bought " + values.getProduct() + " has not any discounted price  " + discountedPrice +" ;");
				}
				else {
					System.out.print(values.getName() + " has bought " + values.getProduct() + " in discounted price i.e " + discountedPrice+" ;");
				}
			}
		}
	}

}
