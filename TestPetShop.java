package PetShop;

public class TestPetShop extends Tranzaction{
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Customer customer = new Customer(); 
		//Tranzaction tranzaction = new Tranzaction(); //cannot instantiate the type Tranzaction(declared abstract)
		Tranzaction tranzaction = new TestPetShop(); //object declared here uses a reference to Tranzaction data type
		TestPetShop test = new TestPetShop();
		
		employee.displayEmployee(employee);
		System.out.println("_______________________________");
		employee.setEmployeeName("Elena");
		employee.setHiredate("10.12.12");
		employee.setDateOfBirth("12.08.97");
		employee.displayEmployee(employee);
		
		System.out.println("_______________________________");
		employee.displayEmployee(customer);
		
		System.out.println("_______________________________");
		customer.displayCustomer();
		customer.setCustomerName("Maria");
		customer.displayCustomer();
		
		System.out.println("_______________________________");
		System.out.println(tranzaction.toString());
		
		System.out.println("_______________________________");
		tranzaction.setEmployeeName("Elena");
		tranzaction.setCustomerName("Maria");
		tranzaction.setTranzactionDate("12.12.12");
		System.out.println(tranzaction.toString());
	}
}
