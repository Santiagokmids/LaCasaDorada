package model;

public class Client extends People implements Comparable<Client>{

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

	@Override
	public int compareTo(Client oC) {
		
		int verify = getLastName().compareTo(oC.getLastName())*(-1);
		
		System.out.println(verify);
		
		return verify;
	}
}
