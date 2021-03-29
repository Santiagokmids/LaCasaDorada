package model;

public class Client extends People {

	//Attributes

	private static final long serialVersionUID = 1;
	private String address;
	private String telephone;
	private String fieldOfObservations;

	public Client(String name, String lastName, String id, String address, String telephone, String fieldOfObservations, Modifiers modifiers, State state) {

		super(name, lastName, id, modifiers,state);
		this.address = address;
		this.telephone = telephone;
		this.fieldOfObservations = fieldOfObservations;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getFieldOfObservations() {
		return fieldOfObservations;
	}

	public void setFieldOfObservations(String fieldOfObservations) {
		this.fieldOfObservations = fieldOfObservations;
	}
	
	public String toString() {
		return getName()+" "+getLastName();
	}

	@Override
	public int compareTo(Client c1) {
		
		int verify = getLastName().compareTo(c1.getLastName());
			
		if(verify == 0) {
			verify = getName().compareTo(c1.getName());
		}
		
		return verify;
	}
	
	public int compare(String lastName, String name) {
		
		int verify = getLastName().compareTo(lastName);
			
		if(verify == 0) {
			verify = getName().compareTo(name);
		}
		
		return verify;
	}
}
