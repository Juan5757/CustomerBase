package it.xpug.ocp.customerbase;
import java.util.*;


public class CustomerBase {

	private List<Customer> customers = new ArrayList<Customer>();

	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public List<Customer> findBy(String TypeOfFind,String firstName,String lastName,int credit) {
		List<Customer> result = new ArrayList<Customer>();
		if(TypeOfFind=="LastName"){
			FindMode findMode =  new LastName(lastName,customers);
			result = findMode.find();
		}
		if(TypeOfFind=="FirstAndLastName"){			
			FindMode findMode = new FirstNameLastName(firstName,lastName,customers);
			result = findMode.find();
		}
		if(TypeOfFind=="CreditGreaterThan"){
			FindMode findMode = new CreditGreaterThan(credit,customers);
			result = findMode.find();
		}
		if(TypeOfFind=="CreditLessThan"){
			FindMode findMode = new CreditLessThan(credit,customers);
			result = findMode.find();
		}
		return result;
	}



}
