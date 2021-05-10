package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService {

CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService cstCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public CustomerManager() {
		
	}

	@Override
	public void add(Customer customer) throws Exception {
		if (!customerCheckService.CheckIfRealPerson(customer))
			throw new Exception("Hata. Bilgilerinizi kontrol edin.");
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " "+" kaydýnýz alýndý. Aramýza hoþgeldiniz.");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName()+"  " +" kullanýcý bilgileriniz güncellendi.");	
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() +" "+ "kullanýcý silindi.");
	}

}
