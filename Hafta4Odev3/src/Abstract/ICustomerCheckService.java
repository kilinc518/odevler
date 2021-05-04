package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerCheckService {

	boolean CheckIsrealPerson(Customer custome) throws NumberFormatException, RemoteException;
}
