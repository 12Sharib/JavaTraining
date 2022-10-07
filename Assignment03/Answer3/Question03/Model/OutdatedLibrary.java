package co.Assignment03.Answer3.Question03.Model;

public class OutdatedLibrary {
			private String productName;
			private String libraryName;
			private Integer version;
//			public Library(String productName, String libraryName, String version) {
//				this.productName = productName;
//				this.libraryName = libraryName;
//				this.version = version;
//			}
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
			public Integer getVersion() {
				return version;
			}
			public void setVersion(Integer version) {
				this.version = version;
			}
			@Override
			public String toString() {
				return String.format("  productName :%s, LibraryName : %s,Version =:%s\n",productName, libraryName,version,"\n");
			}
			
		}


