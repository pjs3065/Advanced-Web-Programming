package myPackage;

public class Customer {
	private String customerID, name;
    private double balance;
    
    public String getFormattedBalance() {
        return(String.format("$%,.2f", getBalance()));
    }

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
