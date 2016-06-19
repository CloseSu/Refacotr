package ReplaceDataValueWithObject;

import java.util.Collection;
import java.util.Iterator;

public class Order {
	private Customer _customer;

	public Order(String customer){
		_customer = new Customer(customer);
	}
	private static int nuberOfOrdersfor(Collection orders,String customer){
		int result = 0;
		Iterator iter = orders.iterator();
		while(iter.hasNext()){
			Order each = (Order)iter.next();
			if(each.getCustomerName().equals(customer)){
				result++;
			}
		}
		return result;
	}
	public String getCustomerName() {
		return _customer.getName();
	}

	public void setCustomer(String customerName) {
		this._customer = new Customer(customerName);
	}
	
}
