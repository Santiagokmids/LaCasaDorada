package model;

public class PreOrder {
	
	//Attributes
	private Product product;
	private Integer amount;
	
	public PreOrder(Product product, Integer amount) {
		this.setProduct(product);
		this.amount = amount;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


	
}
