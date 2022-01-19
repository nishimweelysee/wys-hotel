package org.wys.hotel.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.wys.hotel.domain.Room;
import org.wys.hotel.service.RoomService;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

import java.util.ArrayList;
import java.util.List;

public class RoomModel {
    RoomService roomService;
    private Room room;
    private List<Room> rooms;
    private Integer showItems;
    private String searchKey;

    private int count;
    @Init
    private void init() {
        room = new Room();
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("org.wys.hotel");
        appContext.refresh();
        roomService = (RoomService) appContext.getBean("roomService");
        rooms = roomService.getAllRooms();
        showItems = 10;
    }

    @Command
    @NotifyChange("count")
    public void cmd() {
        ++count;
    }

    public int getCount() {
        return count;
    }

    @Command
    public void openNewRoomModal(){
        Window window = (Window) Executions.createComponents(
                "addRoom.zul", null, null);
        window.doModal();
    }

    @Command
    @NotifyChange("rooms")
    public void saveRoom(){
        try {
            room.setStatus(false);
            roomService.createRoom(room);
            rooms = roomService.getAllRooms();
        }catch (Exception e){
            Messagebox.show(e.getMessage(),"Error",Messagebox.ABORT,Messagebox.ERROR);
        }

    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public Integer getShowItems() {
        return showItems;
    }
    public void setShowItems(Integer showItems) {
        this.showItems = showItems;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
}
