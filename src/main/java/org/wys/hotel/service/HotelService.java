package org.wys.hotel.service;

import org.springframework.stereotype.Service;
import org.wys.hotel.domain.Hotel;


@Service("hotelService")
public interface HotelService {
	public void saveHotel(Hotel hotel);
}
