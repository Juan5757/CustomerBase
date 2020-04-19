package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

public class CreditLessThan implements FindMode {

	int credit;
	List<Customer> customers;
	
	CreditLessThan(int credit,List<Customer> customers){
		this.credit=credit;
		this.customers=customers;
	}
	
	@Override
	public List<Customer> find() {
		// TODO Auto-generated method stub
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.credit() < credit) {
				result.add(customer);
			}
		}
		return result;
	}

}
