package model;

import java.io.Serializable;

public class Modifiers implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
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
