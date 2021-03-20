package model;

public class Size {
	
	//Attributes
	private String size;
	private double price;

	public Size(String size, double price) {
		this.size = size;
		this.price = price;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	
	
}
