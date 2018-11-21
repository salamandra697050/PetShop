package PetShop;

public abstract class Tranzaction extends Customer{
	public String tranzactionDate;
	
	public void setTranzactionDate(String TranzactionDate) {
		tranzactionDate = TranzactionDate;
	}
	
	public String getTranzactionDate() {
		return tranzactionDate;
	}
	
	public String toString() {
		return "Employee : " + super.getEmployeeName() + "\nCustomer : " + super.getCustomerName() + "\nTranzaction date : " + getTranzactionDate();
	}
	
	public void employeeTranzaction(Employee employeeParameter) {
		employeeParameter.displayEmployee(employeeParameter);
	}
	
	public void customerTranzaction(Customer customerParameter) {
		customerParameter.displayCustomer();
	}
}
