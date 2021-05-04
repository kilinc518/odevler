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
			System.out.println("M��teri eklendi : " + customer.getFirstName());
		}else
		{
			System.out.println("Mersis do�rulama hatas�...");
			System.out.println("M��teri bilgileri : " + customer.getFirstName());
		}
		
		
		
	}

	@Override
	public void Update(Customer customer) {
		
		System.out.println("M��teri g�ncellendi : " + customer.getFirstName());
		
	}

	@Override
	public void Delete(Customer customer) {
		
		System.out.println("M��teri silindi : " + customer.getFirstName());
		
	}

	

}
