package model;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	
	//Attributes
	
	private String code;
	private StateOrder state;
	private ArrayList<Integer> amount;
	private Date date;
	private String fieldOfObservations;
	private Client orderClient;
	private ArrayList<Product> products;
	private Employee orderEmployee;
	
	public Order(String code, StateOrder state, ArrayList<Integer> amount, Date date, String fieldOfObservations, Client orderClient,
			ArrayList<Product>products, Employee ordEmployee) {
		
		this.code = code;
		this.state = state;
		this.amount = amount;
		this.date = date;
		this.fieldOfObservations = fieldOfObservations;
		this.orderClient = orderClient;
		this.products = products;
		this.orderEmployee = ordEmployee;
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
	
}
