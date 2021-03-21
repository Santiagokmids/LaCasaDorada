package model;

public class PreOrder {
	
	//Attributes
	private Product product;
	private Integer amount;
	
	//Relations
	private Modifiers usersCreators;

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

	public String getNameProduct() {
		return product.getName();
	}

	public Modifiers getUsersCreators() {
		return usersCreators;
	}

	public void setUsersCreators(Modifiers usersCreators) {
		this.usersCreators = usersCreators;
	}
	
}
