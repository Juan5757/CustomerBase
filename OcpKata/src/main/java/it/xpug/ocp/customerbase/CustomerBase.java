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
			LastName lastname = new LastName(lastName,customers);
			FindMode findMode = lastname;
			result = findMode.find();
		}
		if(TypeOfFind=="FirstAndLastName"){
			FirstNameLastName firstnameAndlastname = new FirstNameLastName(firstName,lastName,customers);
			FindMode findMode = firstnameAndlastname;
			result = findMode.find();
		}
		if(TypeOfFind=="CreditGreaterThan"){
			CreditGreaterThan creditGreaterThan = new CreditGreaterThan(credit,customers);
			FindMode findMode = creditGreaterThan;
			result = findMode.find();
		}
		if(TypeOfFind=="CreditLessThan"){
			CreditLessThan creditLessThan = new CreditLessThan(credit,customers);
			FindMode findMode = creditLessThan;
			result = findMode.find();
		}
		return result;
	}



}
