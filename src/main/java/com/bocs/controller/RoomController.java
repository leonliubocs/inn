package com.bocs.controller;

import com.bocs.mapper.RoomMapper;
import com.bocs.mapper.RoomStatusMapper;
import com.bocs.pojo.Room;
import com.bocs.pojo.RoomStatus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@Controller
public class RoomController {

    @Autowired
    RoomMapper roomMapper;

    @Autowired
    RoomStatusMapper roomStatusMapper;

    @GetMapping("/room")
    public String queryRoomList(Model model){
        Collection<Room> rooms = roomMapper.queryRoomList();
//        Collection<RoomStatus> roomStatus = roomStatusMapper.queryRoomStatusList();
        model.addAttribute("rooms", rooms);
        return "/room/room-list.html";
    }

    @GetMapping("/room-add")
    public String toAddRoom(Model model){
        List<RoomStatus> roomStatuses = roomStatusMapper.queryRoomStatusList();
//        Collection<RoomStatus> roomStatus = roomStatusMapper.queryRoomStatusList();
        model.addAttribute("roomStatus", roomStatuses);
        return "/room/add.html";
    }


    @PostMapping("/room-add")
    public String addRoom(Room room){
        roomMapper.insertRoom(room);
        return "redirect:/room";
    }

    @GetMapping("/room-update/{roomId}")
    public String toUpdateRoom(@PathVariable("roomId") String roomId, Model model){
        Room room = roomMapper.queryRoomById(roomId);
        List<RoomStatus> roomStatuses = roomStatusMapper.queryRoomStatusList();
        model.addAttribute("room",room);
        model.addAttribute("roomStatuses",roomStatuses);
        return "room/update";
    }


    @PostMapping("/doRoomUpdate")
    public String toUpdateRoom(Room room){
        System.out.println(room);
        roomMapper.updateRoom(room);
        return "redirect:/room";
    }



    @GetMapping("/room-delete/{roomId}")
    public String deleteRoom(@PathVariable("roomId") String roomId) {
        System.out.println(roomId);
        roomMapper.deleteRoom(roomId);
        return "redirect:/room";
    }

   // room-startClean
   @GetMapping("/room-startClean/{roomId}")
   public String roomstartClean(@PathVariable("roomId") String roomId) {
       roomMapper.roomstartClean(roomId);
       return "redirect:/room";
   }

    //room-completeClean
    @GetMapping("/room-completeClean/{roomId}")
    public String roomcompleteClean(@PathVariable("roomId") String roomId) {
        System.out.println(roomId);
        roomMapper.roomCompleteClean(roomId);
        return "redirect:/room";
    }

    //house keeping
    @GetMapping("/housekeeping")
    public String queryHouseKeepingRoomList(Model model){
        Collection<Room> rooms = roomMapper.queryRoomList();
//        Collection<RoomStatus> roomStatus = roomStatusMapper.queryRoomStatusList();
        model.addAttribute("rooms", rooms);
        return "/room/housekeeping.html";
    }

}
