package org.wys.hotel.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.wys.hotel.domain.Reservation;
import org.wys.hotel.repository.ReservationRepository;

@Service("reservationService")
public class ReservationService implements IReservation {

	ReservationRepository repo;
	
	public ReservationService(ReservationRepository repo) {
		this.repo = repo;
	}

	@Override
	public void save(Reservation rs) {
		// TODO Auto-generated method stub
		try {
			repo.save(rs);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(Reservation rs) {
		// TODO Auto-generated method stub
		try {
			repo.delete(rs);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(Reservation rs) {
		// TODO Auto-generated method stub
		try {
			repo.save(rs);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
