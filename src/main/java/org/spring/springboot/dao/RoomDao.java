package org.spring.springboot.dao;

import org.spring.springboot.domain.Room;
import org.spring.springboot.domain.RoomType;
import org.spring.springboot.domain.RoomerRecord;
import org.spring.springboot.domain.StatusRoom;

import java.util.List;

public interface RoomDao {
    /**
     * 查询所有房间信息
     */
    public List<Room> findAllRoom();

    /**
     * 查询所有房间类型信息
     */
    public List<RoomType> findAllRoomType();

    /**
     * 查询所有住客信息
     */
    public List<RoomerRecord> findAllRoomer();

    /**
     * 找出所有可用的房间
     */
    public List<Room> findRoomUnused();

    /**
     * 根据房间号查询房间价格
     */
    public RoomType findPriceByRoomTypeTitle(String type);

    /**
     * 根据房间类型号查询相关房间信息
     */
    public List<Room> findRoomByTIN(Long tin);

    /**
     * 根据OCIN查询相关房客信息
     */
    public List<RoomerRecord> findRoomerByOCIN(Long ocin);

    /**
     * 根据类型名查询相关房间可入住数目
     */
    public List<Room> findamountByRoomTypeTitle(String roomtypetitle);

    /**
     * 查询房间类型
     */
    public RoomType findRoomType(Long rin);

    /**
     * 查询房间状态
     */
    public StatusRoom findRoomStatus(Long rin);

    /**
     * 添加房间
     */
    public Long addRoom(Room room);

    /**
     * 删除房间
     */
    public Long deleteRoom(Long rin);

    /**
     * 修改房间信息
     */
    public Long modifyRoom(Room room);

    /**
     * 修改房间类型价格
     */
    public Long modfiyRoomType(RoomType roomType);

    /**
     *添加房间类型
     */
    public Long addRoomType(RoomType roomType);

    /**
     * 删除房间类型
     */
    public Long deleteRoomType(Long tin);
}
