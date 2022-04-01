package org.spring.springboot.dao;

import org.spring.springboot.domain.Room;
import org.spring.springboot.domain.RoomType;
import org.spring.springboot.domain.StatusRoom;

import java.util.List;

public interface RoomDao {
    /**
     * 查询所有房间信息
     */
    public List<Room> findAllRoom();
    /**
     * 根据房间号查询房间信息
     */
    public Room findRoomByRIN(Long rin);

    /**
     * 查询房间类型
     */
    public RoomType findRoomType(Long rin);

    /**
     * 添加房间
     */
    public Long addRoom(Room room);

    /**
     * 查询房间状态
     */
    public StatusRoom findRoomStatus(Long rin);

    /**
     * 删除房间
     */
    public Long deleteRoom(Long rin);

    /**
     * 修改房间信息
     */
    public Long modifyRoom(Room room);
}
