package org.wys.hotel.model;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wys.hotel.domain.Customer;
import org.wys.hotel.domain.Reservation;
import org.wys.hotel.domain.Room;
import org.wys.hotel.service.CustomerService;
import org.wys.hotel.service.ReservationService;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.util.Clients;

public class ReservationModel {
	
	ReservationService reservationService;
	CustomerService customerService;
	
	
	
	Reservation reservation = new Reservation();
	Customer customer = new Customer();
	Room room = new Room();
	
	List<Reservation> reservations;
	List<Room> rooms;
	
	private AnnotationConfigApplicationContext appContext;
	@Init
	private void init() {
		appContext = new AnnotationConfigApplicationContext();
        appContext.scan("org.wys.hotel");
        appContext.refresh();
        reservationService = (ReservationService) appContext.getBean("reservationService");
        customerService =(CustomerService) appContext.getBean("customerService");
        // getting all the rooms
        // rooms = ;
        refreshList();
	}
	
	
	public void refreshList() {
		reservations = reservationService.findAll();
	}
	
	@Command
	@NotifyChange("reservations")
	public void save() {
		
		//find room by id
		
		//set 
		//saving customer in db
		customerService.save(customer);
		
		//setting the customer for reservation
		reservation.setCustomer(customer);
		reservationService.save(reservation);
		Clients.showNotification(" Reservation made successfully",Clients.NOTIFICATION_TYPE_INFO,null,"top center",5000,true);
		refreshList();
	}
	
	
	
	
	public List<Reservation> getReservations() {
		return reservations;
	}

	public Reservation getReservation() {
		return reservation;
	}


	public Customer getCustomer() {
		return customer;
	}


	public Room getRoom() {
		return room;
	}


	public List<Room> getRooms() {
		return rooms;
	}
	
	
	

	
	
	
	
 
}
