package ChangeBidirectionalAssociationToUndirectioal;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private Set _orders = new HashSet();
	Set friendOrdets(){
		return _orders;
	}
	void addOrder(Order arg){
		arg.setCustomer(this);
	}
	public int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
