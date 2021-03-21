package model;

public class Modifiers {
	
	//Attributes
	private User createObject;
	private User lastModifier;
	
	public Modifiers(User createObject, User lastModifier) {
		this.setCreateObject(createObject);
		this.setLastModifier(lastModifier);
	}

	public User getLastModifier() {
		return lastModifier;
	}

	public void setLastModifier(User lastModifier) {
		this.lastModifier = lastModifier;
	}

	public User getCreateObject() {
		return createObject;
	}

	public void setCreateObject(User createObject) {
		this.createObject = createObject;
	}
	
	
	
	
}
