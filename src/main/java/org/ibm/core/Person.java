package org.ibm.core;

public class Person {
	//Autowired by name 
	private String pName;
	private Address ad;
	//Autowired by name so use ad if autowired by type use Address
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	

}
