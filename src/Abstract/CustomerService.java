package Abstract;

import Entities.Customer;

public interface CustomerService {
	
	void add(Customer customer) throws Exception;
	void update(Customer customer);
	void delete(Customer customer);

}
