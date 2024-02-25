package service;

import model.Address;

public class DemoService {

	private String name;
	private Address address;
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void getDetails() {
		System.out.println(" hello i am " + name + " from "+ address.getCity().getName());
	}
	
}
