package com.bocs.mapper;

import com.bocs.pojo.Room;
import com.bocs.pojo.Staff;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomMapper {

    List<Room> queryRoomList();
    Room queryRoomByRoomStatusId(int roomStatusId);
    Room queryRoomById(String roomId);
    void insertRoom(Room room);
    void updateRoom(Room room);
    void deleteRoom(String roomId);
    void roomstartClean(String roomId);
    void roomCompleteClean(String roomId);

}
