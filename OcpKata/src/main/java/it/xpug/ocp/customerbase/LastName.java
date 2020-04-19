package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class LastName implements FindMode{
	
	String lastName;
	List<Customer> customers;
	
	LastName(String lastName,List<Customer> customers){
		this.lastName = lastName;
		this.customers = customers;
	}
	
	@Override
	public List<Customer> find() {
		// TODO Auto-generated method stub
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.lastName().equals(lastName)) {
				result.add(customer);
			}
		}
		return result;
	}

}
