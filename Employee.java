package PetShop;

public class Employee implements People {
	private String name;
	private String hiredate;
	private String dateOfBirth;
	
	public void displayEmployee(Employee employeeParameter) {
		System.out.println("Name: " + employeeParameter.getEmployeeName() 
									+ "\nHiredate: " + employeeParameter.getHiredate() 
									+ "\nDate of birth: " + employeeParameter.getDateOfBirth());
	}
	
	public void setEmployeeName(String Name) {
		name = Name;
	}
	
	public void setHiredate(String Hiredate) {
		hiredate = Hiredate;
	}
	
	public void setDateOfBirth(String DateOfBirth) {
		dateOfBirth = DateOfBirth;
	}
	
	public String getEmployeeName() {
		return name;
	}
	
	public String getHiredate() {
		return hiredate;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
}
