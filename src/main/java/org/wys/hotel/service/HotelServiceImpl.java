package org.wys.hotel.service;

import org.springframework.stereotype.Service;
import org.wys.hotel.domain.Hotel;
import org.wys.hotel.repository.HotelRepository;

@Service(value = "hotelService")
public class HotelServiceImpl implements HotelService{
	
	HotelRepository hotelRepository;
	
	
	public HotelServiceImpl(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public void saveHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		hotelRepository.save(hotel);
	}
}