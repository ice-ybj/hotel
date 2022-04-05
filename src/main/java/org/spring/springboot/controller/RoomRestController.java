package org.spring.springboot.controller;

import org.spring.springboot.domain.Room;
import org.spring.springboot.domain.RoomType;
import org.spring.springboot.domain.RoomerRecord;
import org.spring.springboot.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomRestController {
    @Autowired
    private RoomService roomService;

    @GetMapping("/api/room")
    public List<Room> findAllRoom(){
        return roomService.findAllRoom();
    }

    @PostMapping("/api/room")
    public String addRoom(@RequestBody Room room){
        return roomService.addRoom(room);
    }

    @GetMapping("/api/room/type")
    public List<RoomType> findAllRoomType(){return roomService.findAllRoomType();}

    @PostMapping("/api/room/type")
    public String addRoomType(@RequestBody RoomType roomType){return roomService.addRoomType(roomType);}

    @GetMapping("/api/roomer")
    public List<RoomerRecord> findAllRoomer(){return roomService.findAllRoomer();}

    @GetMapping("/api/roomer/{ocin}")
    public RoomerRecord findRoomerByOCIN(@PathVariable("ocin") Long ocin){return roomService.findRoomerByOCIN(ocin);}

    @GetMapping("/api/room/{type}")
    public Double findPriceByRoomTypeTitle(@PathVariable("type") String type){
        return roomService.findPriceByRoomTypeTitle(type);
    }

    @GetMapping("/api/room/find/{tin}")
    public List<Room> findRoomByTIN(@PathVariable("tin") Long tin){
        return roomService.findRoomByTIN(tin);
    }

    @PostMapping("/api/room/{rin}")
    public String deleteRoom(@PathVariable("rin") Long rin){
        return roomService.deleteRoom(rin);
    }

    @GetMapping("/api/room/type/{rin}")
    public RoomType findRoomType(@PathVariable("rin") Long rin){
        return roomService.findRoomType(rin);
    }

    @PostMapping("/api/room/type/{tin}")
    public String deleteRoomType(@PathVariable("tin") Long tin){return roomService.deleteRoomType(tin);}

    @GetMapping("/api/room/status/{rin}")
    public String findRoomStatus(@PathVariable("rin") Long rin){
        return roomService.findRoomStatus(rin);
    }

    @PostMapping("/api/room/modify/{rin}")
    public String modifyRoom(@RequestBody Room room){
        return roomService.modifyRoom(room);
    }

    @PostMapping("/api/room/type/modify/{tin}")
    public String modifyRoomType(@RequestBody RoomType roomType){return roomService.modifyRoomType(roomType);}

}
