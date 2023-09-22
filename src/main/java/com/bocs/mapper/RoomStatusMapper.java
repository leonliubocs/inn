package com.bocs.mapper;

import com.bocs.pojo.Room;
import com.bocs.pojo.RoomStatus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RoomStatusMapper {
    List<RoomStatus> queryRoomStatusList();
    String queryRoomStatusById(int roomStatusId);
}
