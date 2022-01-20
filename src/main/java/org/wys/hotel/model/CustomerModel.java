package org.wys.hotel.model;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wys.hotel.domain.Customer;
import org.wys.hotel.service.CustomerService;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.util.Clients;

public class CustomerModel {

	CustomerService service;
	
	Customer customer = new Customer();
	
	
	
	
	public CustomerModel(CustomerService service) {
		super();
		this.service = service;
	}

	List<Customer>  customers;
	private AnnotationConfigApplicationContext appContext;
	
	@Init
	public void init() {
		appContext = new AnnotationConfigApplicationContext();
        appContext.scan("org.wys.hotel");
        appContext.refresh();
        service = (CustomerService) appContext.getBean("customerService");
        customers = service.findAll();
		
	}
	
	@Command
	@NotifyChange("customers")
	public void save() {
		service.save(customer);
		Clients.showNotification(" Reservation made successfully",Clients.NOTIFICATION_TYPE_INFO,null,"top center",5000,true);
		customers = service.findAll();
	}
}
