package org.spring.springboot.service.impl;


import org.spring.springboot.dao.RoomDao;
import org.spring.springboot.domain.Room;
import org.spring.springboot.domain.RoomType;
import org.spring.springboot.domain.RoomerRecord;
import org.spring.springboot.domain.StatusRoom;
import org.spring.springboot.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<RoomType> findAllRoomType() {
        return roomDao.findAllRoomType();
    }

    @Override
    public List<RoomerRecord> findAllRoomer() {
        return roomDao.findAllRoomer();
    }



    @Override
    public List<Room>[] findRoomUnused() {
        List<Room> rooms = roomDao.findRoomUnused();
        List<RoomType> roomTypes = roomDao.findAllRoomType();
        List<Room> lis[]= new ArrayList[roomTypes.size()+1];
        for(int i=1;i<=roomTypes.size();i++){
            lis[i] = new ArrayList<>();
        }
        for(Room r : rooms){
            for(int i=1;i<=roomTypes.size();i++){
                if(r.getTIN()==i){lis[i].add(r);}
            }
        }
        return lis;
    }


    @Override
    public Double findPriceByRoomTypeTitle(String type) {
        RoomType room = roomDao.findPriceByRoomTypeTitle(type);
        return room.getPrice();
    }

   @Override
    public List<Room> findRoomByTIN(Long tin){
        return roomDao.findRoomByTIN(tin);
    }

    @Override
    public RoomerRecord findRoomerByOCIN(Long ocin) {
        return roomDao.findRoomerByOCIN(ocin);
    }

    @Override
    public int findamountByRoomTypeTitle(String roomtypetitle) {
        List<Room> roomlists = roomDao.findamountByRoomTypeTitle(roomtypetitle);
        return roomlists.size();
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

    @Override
    public String modifyRoomType(RoomType roomType){
        Long flag = roomDao.modfiyRoomType(roomType);
        if(flag==1) return "修改成功！";
        return "modify error";
    }

    @Override
    public String addRoomType(RoomType roomType) {
        roomDao.addRoomType(roomType);
        return "添加成功！";
    }

    @Override
    public String deleteRoomType(Long tin) {
        Long flag = roomDao.deleteRoomType(tin);
        if(flag==1) return "删除成功！";
        return "delete error";
    }
}
