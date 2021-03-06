package ChangeValueToReference;

import java.util.Dictionary;
import java.util.Hashtable;

public class Customer {
	private final String _name;
	
	public static Customer getNamed(String name){
		return (Customer)_instances.get(name);
	}
	private static Dictionary _instances = new Hashtable();
	
	static void loadCustomers(){
		new Customer("Lemon Car Hire").store();
		new Customer("Associated Coffee Machines").store();
		new Customer("Bilston Gasworks").store();
	}
	private void store(){
		_instances.put(this.getName(), this);
	}
	
	Customer(String name){
		_name = name;
	}
	public String getName(){
		return _name;
	}

}
