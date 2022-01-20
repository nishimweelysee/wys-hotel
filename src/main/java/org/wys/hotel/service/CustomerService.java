package org.wys.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.wys.hotel.domain.Customer;
import org.wys.hotel.repository.CustomerRepository;

@Service("customerService")
public class CustomerService implements ICustomer {
	
	CustomerRepository repo;
	
	

	public CustomerService(CustomerRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		try {
			repo.save(customer);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		    try {
					repo.delete(customer);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		   try {
					repo.save(customer);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		
	}

}
