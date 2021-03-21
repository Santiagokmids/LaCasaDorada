package model;

public class Size {
	
	//Attributes
	private String size;
	
	//Relations
	private Modifiers usersCreators;

	public Size(String size) {
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Modifiers getUsersCreators() {
		return usersCreators;
	}

	public void setUsersCreators(Modifiers usersCreators) {
		this.usersCreators = usersCreators;
	}

	
}
