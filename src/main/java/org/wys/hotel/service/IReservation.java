package org.wys.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.wys.hotel.domain.Reservation;

public interface IReservation {
	
	public void save(Reservation rs);
	public List<Reservation> findAll();
	public void delete(Reservation rs);
	public void update(Reservation rs);

}
