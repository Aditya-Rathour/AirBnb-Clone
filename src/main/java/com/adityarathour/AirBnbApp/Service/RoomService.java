package com.adityarathour.AirbnbApp.Service;

import com.adityarathour.AirbnbApp.DTO.RoomDto;

import java.util.List;

public interface RoomService {
    RoomDto createRoom(Long hotelId,RoomDto roomDto);
    List<RoomDto> getAllRoomsInHotel(Long hotelId);
    RoomDto getRoomById(Long roomId);
    void deleteRoomById(Long roomId);
}
