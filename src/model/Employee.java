package model;

public class Employee extends People {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;

	public Employee(String name, String lastName, String id, State state, Modifiers usersModifiers) {
		super(name, lastName, id, state, usersModifiers);
	}
}
