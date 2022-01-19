package org.wys.hotel.service;

import org.springframework.stereotype.Service;
import org.wys.hotel.domain.Room;
import org.wys.hotel.repository.RoomRepository;

import java.util.List;

@Service(value = "roomService")
public class RoomServiceImpl implements RoomService {
    RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public void createRoom(Room room) {
        roomRepository.save(room);
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
