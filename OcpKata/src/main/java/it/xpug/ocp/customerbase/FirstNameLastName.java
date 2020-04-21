package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class FirstNameLastName implements FindMode {
	
	String firstName;
	String lastName;
	List<Customer> customers;
	
	FirstNameLastName(Customer customer,List<Customer> customers){
		firstName = customer.firstName();
		lastName = customer.lastName();
		this.customers = customers;
	}
	
	@Override
	public List<Customer> find() {
		// TODO Auto-generated method stub
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.firstName().equals(firstName) && customer.lastName().equals(lastName) ) {
				result.add(customer);
			}
		}
		return result;
	}

}
