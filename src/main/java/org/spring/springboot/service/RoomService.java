package org.spring.springboot.service;


import org.spring.springboot.domain.Room;
import org.spring.springboot.domain.RoomType;

import java.util.List;

public interface RoomService {
    /**
     * 查询所有房间信息
     */
    public List<Room> findAllRoom();

    /**
     * 查询房间信息
     */
    public String findRoomByRIN(Long rin);

    /**
     * 查询房间类型
     */
    public RoomType findRoomType(Long rin);

    /**
     *添加房间
     */
    public String addRoom(Room room);

    /**
     * 查询房间当前状态
     */
    public String findRoomStatus(Long rin);

    /**
     * 删除房间
     */
    public String deleteRoom(Long rin);

    /**
     * 修改房间信息
     */
    public String modifyRoom(Room room);
}
