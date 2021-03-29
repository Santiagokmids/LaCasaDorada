package model;

public class Employee extends People {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;

	public Employee(String name, String lastName, String id, Modifiers usersModifiers, State state) {
		super(name, lastName, id, usersModifiers,state);
	}

	@Override
	public int compareTo(Client o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
