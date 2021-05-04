package Adapter;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MersisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIsrealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		
		return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirthYear());
	}

}
