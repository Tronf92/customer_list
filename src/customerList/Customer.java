package customerList;

public class Customer implements ICustomer{
	
	String name,lastName,idCard;
	int mileage;
	
	public String getName(){
		return name;
	}
	public String getLastName(){
		return lastName;
	}
	
	public String toString(){
		String miles = Integer.toString(mileage);
		String customer = "Name: " + name + " Last Name: " + lastName + " Id Card: " + idCard + " Distance flown: " + miles;
		return customer;
	}
	public String getIDCard(){
		return idCard;
	}
	public void setMileage(int miles){
		System.out.println(miles);
		mileage = miles;
	}
	public void updateMileage(int milesToAdd){
		mileage += milesToAdd;
	}
	
	public void setName(String nm){
		name = nm;
	}
	public void setLastName(String lastNm){
		lastName = lastNm;
	}
	public void setIDCard(String idcard){
		idCard = idcard;
	}
}
