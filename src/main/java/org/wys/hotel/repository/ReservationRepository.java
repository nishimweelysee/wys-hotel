package org.wys.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wys.hotel.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
