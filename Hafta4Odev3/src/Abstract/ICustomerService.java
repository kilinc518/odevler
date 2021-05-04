package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService {
	void Add(Customer customer) throws NumberFormatException, RemoteException;
	void Update(Customer customer);
	void Delete(Customer customer);
}
