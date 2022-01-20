package org.wys.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wys.hotel.domain.Room;

public interface RoomRepository extends JpaRepository<Room,Integer> {
}
