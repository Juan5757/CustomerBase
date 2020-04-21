package it.xpug.ocp.customerbase;
import java.util.*;


public class CustomerBase {

	private List<Customer> customers = new ArrayList<Customer>();

	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public List<Customer> findBy(String TypeOfFind,Customer customer) {
		List<Customer> result = new ArrayList<Customer>();
		if(TypeOfFind=="LastName"){
			FindMode findMode =  new LastName(customer,customers);
			result = findMode.find();
		}
		if(TypeOfFind=="FirstAndLastName"){			
			FindMode findMode = new FirstNameLastName(customer,customers);
			result = findMode.find();
		}
		if(TypeOfFind=="CreditGreaterThan"){
			FindMode findMode = new CreditGreaterThan(customer,customers);
			result = findMode.find();
		}
		if(TypeOfFind=="CreditLessThan"){
			FindMode findMode = new CreditLessThan(customer,customers);
			result = findMode.find();
		}
		return result;
	}



}
