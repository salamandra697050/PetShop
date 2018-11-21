package PetShop;

public class Customer extends Employee implements Client {
	
	public String name;
	
	public void setCustomerName(String CustomerName) {
		name = CustomerName;
	}
	
	public String getCustomerName() {
		return name;
	}
	
	public void displayCustomer() {
		System.out.println("Customer name " + getCustomerName());
	}
}
