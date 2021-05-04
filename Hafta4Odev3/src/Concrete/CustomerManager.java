package Concrete;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;


public class CustomerManager implements ICustomerService {
	
	ICustomerCheckService _customerCheck;

	public CustomerManager(ICustomerCheckService _customerCheck) {
		super();
		this._customerCheck = _customerCheck;
	}

	@Override
	public void Add(Customer customer) throws NumberFormatException, RemoteException {
		
		if(_customerCheck.CheckIsrealPerson(customer)) 
		{
			System.out.println("Müþteri eklendi : " + customer.getFirstName());
		}else
		{
			System.out.println("Mersis doðrulama hatasý...");
			System.out.println("Müþteri bilgileri : " + customer.getFirstName());
		}
		
		
		
	}

	@Override
	public void Update(Customer customer) {
		
		System.out.println("Müþteri güncellendi : " + customer.getFirstName());
		
	}

	@Override
	public void Delete(Customer customer) {
		
		System.out.println("Müþteri silindi : " + customer.getFirstName());
		
	}

	

}
