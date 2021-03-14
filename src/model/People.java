package model;

public abstract class People {
	
	//Attributes
	
	private String name;
	private String lastName;
	private String id;
	private State state;
	
	public People(String name, String lastName, String id, State state) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String toString() {
		String message = "";
		
		return message;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	
}
