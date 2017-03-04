package customerList;

public interface ICustomerList {
	void addCustomer(ICustomer customerToAdd);
	void updateCustomer(ICustomer customerToUpdate,int milesToAdd);
	String toString();
}
