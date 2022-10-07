package co.Assignment03.Answer3.Question02.Model;

public class Customer {
		private String name;
		private String address;
		private Integer date;
		private String product;
		private Integer price;
		private String paymentType;

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

		@Override
		public String toString() {
			return "Customer [name=" + name + ", product=" + product
					+ ", price=" + price +"]\n";
		}

	}



