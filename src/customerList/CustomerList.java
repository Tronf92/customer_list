package customerList;

public class CustomerList implements ICustomerList {
	private ICustomer[] customer = new ICustomer[100];
	private int nrOfCustomers = 0;
	
	public void addCustomer(ICustomer customerToAdd){
		customer[nrOfCustomers] = customerToAdd;
		nrOfCustomers ++;
		
	}
	
	public void updateCustomer(ICustomer customerToUpdate,int milesToAdd){
		ICustomer actualCustomer;
		for(int i=0; i < nrOfCustomers; i++){
			actualCustomer = customer[i];
			if (actualCustomer == customerToUpdate){
				actualCustomer.updateMileage(milesToAdd);
			}
		}
	}
	
	public String toString(){
		String list = "";
		for (int i=0;i< nrOfCustomers; i++){
			list += customer[i].toString() + System.lineSeparator();
		}
		return list;
	}

}
