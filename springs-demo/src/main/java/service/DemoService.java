package service;

public class DemoService {
	
	private String name;
	private String address;
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void getDetails() {
		System.out.println(" hello i am "+ name + "  from  "+ address);
	}
	
	
	
	
}
