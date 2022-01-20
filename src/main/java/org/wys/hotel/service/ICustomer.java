package org.wys.hotel.service;

import java.util.List;

import org.wys.hotel.domain.Customer;

public interface ICustomer {
	
	public void save(Customer customer);
	public List<Customer> findAll();
	public void delete(Customer customer);
	public void update(Customer customer);

}
