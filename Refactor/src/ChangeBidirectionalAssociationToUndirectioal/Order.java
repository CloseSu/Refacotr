package ChangeBidirectionalAssociationToUndirectioal;

public class Order {
	Customer _customer;
	Customer getCustomer(){
		return _customer;
	}
	void adCustomer(Customer arg){
		arg.friendOrdets().add(this);
	}
	void setCustomer(Customer arg){
		if(_customer != null){
			_customer.friendOrdets().remove(this);
		}
		_customer = arg;
		if(_customer != null){
			_customer.friendOrdets().add(this);
		}
	}
	double getDiscountedPrice(Customer customer){
		return getGrossPrice() * (1 - customer.getDiscount());
	}
	private int getGrossPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
