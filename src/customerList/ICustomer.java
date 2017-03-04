package customerList;

public interface ICustomer{
	//interface no implementation
	String getName();
	String getLastName();
	String toString();
	void updateMileage(int milesToAdd);
	String getIDCard();
	void setMileage(int miles);
	void setName(String name);
	void setLastName(String lastName);
	void setIDCard(String idcard);
}
