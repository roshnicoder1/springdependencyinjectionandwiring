package org.ibm.core;

public class Employee {
	private String eName;
	private Address ad;
//	public String geteName() {
//		return eName;
//	}
//	public void seteName(String eName) {
//		this.eName = eName;
//	}
//	public Address getAd() {
//		return ad;
//	}
//	public void setAd(Address ad) {
//		this.ad = ad;
//	}
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", ad=" + ad + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String eName, Address ad) {
		super();
		this.eName = eName;
		this.ad = ad;
	}
	
	
	
	
	

}
