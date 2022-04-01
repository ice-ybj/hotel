package org.spring.springboot.controller;

import org.spring.springboot.domain.Room;
import org.spring.springboot.domain.RoomType;
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

    @GetMapping("/api/room/{rin}")
    public String findRoomLocation(@PathVariable("rin") Long rin){
        return roomService.findRoomByRIN(rin);
    }


    @GetMapping("/api/room/type/{rin}")
    public RoomType findRoomType(@PathVariable("rin") Long rin){
        return roomService.findRoomType(rin);
    }

    @GetMapping("api/room/status/{rin}")
    public String findRoomStatus(@PathVariable("rin") Long rin){
        return roomService.findRoomStatus(rin);
    }

    @PostMapping("/api/room")
    public String addRoom(@RequestBody Room room){
        return roomService.addRoom(room);
    }

    @PostMapping("api/room/{rin}")
    public String deleteRoom(@PathVariable("rin") Long rin){
        return roomService.deleteRoom(rin);
    }

    @PostMapping("api/room/modify/{rin}")
    public String modifyRoom(@RequestBody Room room){
        return roomService.modifyRoom(room);
    }


}
