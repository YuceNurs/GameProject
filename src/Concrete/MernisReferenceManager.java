package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisReferenceManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		int nationalityIdLength =customer.getNationalityId().length();
		if(nationalityIdLength==11) {return true;
		
		}
		return false;
	}

}
