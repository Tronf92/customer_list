package customerList;


public class Main {
	public static void main(String[] args) {
		CustomerList customerList = new CustomerList(); 
		for (int i = 0; i < 20; i++){
			ICustomer customer = new Customer();
			customer.setName("a");
			customer.setLastName("a");
			customer.setIDCard("a");
			customer.setMileage(i);
			
		
		}
	}

}
