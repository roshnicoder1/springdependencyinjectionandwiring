package org.ibm.core;

import java.util.*;

public class Customer {
	int id;
	String name;
	float orderValue;
	private List<String>orders;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(float orderValue) {
		this.orderValue = orderValue;
	}
	
	public List<String> getOrders() {
		return orders;
	}
	public void setOrders(List<String> orders) {
		this.orders = orders;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orderValue=" + orderValue + ", orders=" + orders + "]";
	}
	
	
	public void show() {
		System.out.println("Customer ID"+id);
		System.out.println("Customer name"+name);
		System.out.println("Customer value"+orderValue);
			Iterator<String> itr=orders.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	
		
	}
//	public Customer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Customer(int id, String name, float orderValue) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.orderValue = orderValue;
//	}
	
	
	

}
