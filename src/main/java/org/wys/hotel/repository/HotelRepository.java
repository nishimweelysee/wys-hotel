package org.wys.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wys.hotel.domain.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}