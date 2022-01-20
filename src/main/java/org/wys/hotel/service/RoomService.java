package org.wys.hotel.service;

import org.springframework.stereotype.Service;
import org.wys.hotel.domain.Room;

import java.util.List;

@Service("roomService")
public interface RoomService {
    public void createRoom(Room room);
    public List<Room> getAllRooms();
}
