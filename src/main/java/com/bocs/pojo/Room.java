package com.bocs.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    private String roomId;
    private  String roomType;
    private double price;
    private RoomStatus roomStatus;
    private String description;

}
