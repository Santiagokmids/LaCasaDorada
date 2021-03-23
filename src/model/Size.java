package model;

public class Size {
	
	//Attributes
	private String size;
	private State state;
	
	//Relations
	private Modifiers usersCreators;

	public Size(String size, Modifiers usersCreators) {
		this.size = size;
		this.state = State.ENABLE;
		this.usersCreators = usersCreators;
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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
