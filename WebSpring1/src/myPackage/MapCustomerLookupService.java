package myPackage;

import java.util.Map;

public class MapCustomerLookupService implements CustomerLookupService{
	private Map<String, Customer> custDatabase;

	
	public Map<String, Customer> getCustDatabase() {
		return custDatabase;
	}

	public void setCustDatabase(Map<String, Customer> custDatabase) {
		this.custDatabase = custDatabase;
	}

	@Override
	public Customer getCustomer(String id) {
		if(id == null) id = "unknown";
		return custDatabase.get(id.toLowerCase());
	}
	
	@Override
    public Customer getRichestCustomer() {
        Customer richestCustomer = null;
        double maxBalance = 0;
        for (Customer c: custDatabase.values()) {
            if (c.getBalance() > maxBalance) {
                richestCustomer = c;
                maxBalance = c.getBalance();
            }
        }
        return richestCustomer;
    }
}
