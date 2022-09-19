package assignment02.Answer3.Library;

public class Library {
		private String productName;
		private String libraryName;
		private String version;
		public Library(String productName, String libraryName, String version) {
			this.productName = productName;
			this.libraryName = libraryName;
			this.version = version;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getLibraryName() {
			return libraryName;
		}
		public void setLibraryName(String libraryName) {
			this.libraryName = libraryName;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
		
	}


