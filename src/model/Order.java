package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Order implements Serializable{
	
	//Attributes
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;
	private String code;
	private StateOrder state;
	private ArrayList<Integer> amount;
	private Date date;
	private String fieldOfObservations;
	private Client orderClient;
	private ArrayList<Product> products;
	private Employee orderEmployee;
	private State states;
	
	//Relations
	private Modifiers usersCreators;

	public Order(String code, StateOrder state, ArrayList<Integer> amount, Date date, String fieldOfObservations, Client orderClient,
			ArrayList<Product>products, Employee ordEmployee, Modifiers userCreators) {
		
		this.code = code;
		this.state = state;
		this.amount = amount;
		this.date = date;
		this.fieldOfObservations = fieldOfObservations;
		this.orderClient = orderClient;
		this.products = products;
		this.orderEmployee = ordEmployee;
		this.usersCreators = userCreators;
		this.states = State.ENABLE;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public StateOrder getState() {
		return state;
	}

	public void setState(StateOrder state) {
		this.state = state;
	}

	public ArrayList<Integer> getAmount() {
		return amount;
	}

	public void setAmount(ArrayList<Integer> amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}
	
	public String getDateDay() {
		@SuppressWarnings("deprecation")
		String message = date.getDate()+"/"+(date.getMonth() + 1)+"/"+(date.getYear() - 100)+" - "+date.getHours()+":"+date.getMinutes()+":"+date.getSeconds();
		return message;
	}
	
	public String getNameProduct() {
		String message = "";
		
		for (int i = 0; i < getProducts().size(); i++) {
			
			if(i != getProducts().size() - 1) {
				message += getProducts().get(i).getName()+"\n";
				
			}else {
				message += getProducts().get(i).getName();
			}
		}
		
		return message;
	}
	

	public String getPriceProduct() {
		String message = "";
		
		for (int i = 0; i < getProducts().size(); i++) {
			
			if(i != getProducts().size() - 1) {
				message += getProducts().get(i).getPrice()+"\n";
				
			}else {
				message += getProducts().get(i).getPrice();
			}
		}
		
		return message;
	}
	
	public String getAmountProduct() {
		String message = "";
		
		for (int i = 0; i < getAmount().size(); i++) {
			
			if(i != getAmount().size() - 1) {
				message += getAmount().get(i)+"\n";
				
			}else {
				message += getAmount().get(i);
			}
		}
		
		return message;
	}
	
	public String getNameClient() {
		return orderClient.getName();
	}
	
	public String getNameEmployee() {
		return orderEmployee.getName();
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFieldOfObservations() {
		return fieldOfObservations;
	}

	public void setFieldOfObservations(String fieldOfObservations) {
		this.fieldOfObservations = fieldOfObservations;
	}

	public Employee getOrderEmployee() {
		return orderEmployee;
	}

	public void setOrderEmployee(Employee orderEmployee) {
		this.orderEmployee = orderEmployee;
	}

	public Client getOrderClient() {
		return orderClient;
	}

	public void setOrderClient(Client orderClient) {
		this.orderClient = orderClient;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	public Modifiers getUsersCreators() {
		return usersCreators;
	}

	public void setUsersCreators(Modifiers usersCreators) {
		this.usersCreators = usersCreators;
	}

	public State getStates() {
		return states;
	}

	public void setStates(State states) {
		this.states = states;
	}
	
}
