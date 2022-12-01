package mystore;
/* Here all the Customer demanded products are detailed like which products and how much of the Quantities etc.... */
public class CustomerProductsDTO {
	private Integer productId;
	private String productName;
	private Type productTye;
	private Double ProductPrice;
	private Double QuantityOfProduct;

	public CustomerProductsDTO(Integer productId, String productName, Type productTye, Double price, Double quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productTye = productTye;
		this.ProductPrice = price;
		this.QuantityOfProduct = quantity;
	}

	

	public Integer getProductId() {
		return productId;
	}



	public void setProductId(Integer productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Type getProductTye() {
		return productTye;
	}



	public void setProductTye(Type productTye) {
		this.productTye = productTye;
	}



	public Double getQuantity() {
		return QuantityOfProduct;
	}



	public void setQuantity(Double quantity) {
		this.QuantityOfProduct = quantity;
	}



	public Double getPrice() {
		return QuantityOfProduct;
	}

	public void setPrice(Double price) {
		this.QuantityOfProduct = price;
	}

	@Override
	public String toString() {
		return "CustomerProductsDTO [productId=" + productId + ", productName=" + productName + ", productTye="
				+ productTye + ", price=" + QuantityOfProduct + ", quantity=" + QuantityOfProduct + "]";
	}



}
