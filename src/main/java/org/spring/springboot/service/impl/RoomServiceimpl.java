package org.spring.springboot.service.impl;


import org.spring.springboot.dao.RoomDao;
import org.spring.springboot.domain.Room;
import org.spring.springboot.domain.RoomType;
import org.spring.springboot.domain.StatusRoom;
import org.spring.springboot.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceimpl implements RoomService {
    @Autowired
    private RoomDao roomDao;


    @Override
    public List<Room> findAllRoom() {
        return roomDao.findAllRoom();
    }

    @Override
    public String findRoomByRIN(Long rin) {
        Room room = roomDao.findRoomByRIN(rin);
        String Location = room.getBuilding() + "," + room.getFloor() + "," + room.getPlate();
        return Location;
    }

    @Override
    public RoomType findRoomType(Long rin) {
        return roomDao.findRoomType(rin);
    }

    @Override
    public String addRoom(Room room){
        roomDao.addRoom(room);
        return "添加成功！";
    }

    @Override
    public String findRoomStatus(Long rin){
        StatusRoom roomstatus = roomDao.findRoomStatus(rin);
        String status = roomstatus.getRoom_status_zh();
        return status;
    }

    @Override
    public String deleteRoom(Long rin){
        Long flag = roomDao.deleteRoom(rin);
        if(flag==1) return "删除成功！";
        return "delete error";
    }

    @Override
    public String modifyRoom(Room room){
        Long flag = roomDao.modifyRoom(room);
        if(flag==1) return "修改成功！";
        return "modify error";
    }
}
