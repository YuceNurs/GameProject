package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public  class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
			KPSPublicSoapProxy client = new KPSPublicSoapProxy();
			boolean result = false;
			try {
				result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
						customer.getFirstName(), customer.getLastName(), 
						customer.getDateOfBirth().getYear());
			} catch(NumberFormatException | RemoteException e) {
				e.printStackTrace();
			}
			
			return result;
		}
	
}

	

		  
	

