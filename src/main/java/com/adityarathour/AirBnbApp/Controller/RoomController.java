package com.adityarathour.AirbnbApp.Controller;

import com.adityarathour.AirbnbApp.DTO.RoomDto;
import com.adityarathour.AirbnbApp.Entity.Room;
import com.adityarathour.AirbnbApp.Service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// How to create unique roomId corresponding to hotelId like hotel1 -> room1 room2 and hotel2-> room1 room2 not like hotel1 -> room1 room2 and hotel2-> room3 room4

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/hotels/{hotelId}/rooms")
public class RoomController {
    private final RoomService roomService;

    @PostMapping
    ResponseEntity<RoomDto>createNewRoom(@PathVariable("hotelId") Long hotelId,@RequestBody RoomDto roomDto){
        RoomDto room = roomService.createRoom(hotelId,roomDto);
        return new ResponseEntity<>(room, HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<List<RoomDto>>getAllRoomsInHotel(@PathVariable("hotelId") Long hotelId){
        return new ResponseEntity<>(roomService.getAllRoomsInHotel(hotelId),HttpStatus.OK);
    }

    @GetMapping("/{roomId}")
    ResponseEntity<RoomDto> getRoomById(@PathVariable("hotelId") Long hotelId ,@PathVariable("roomId") Long roomId){
        return new ResponseEntity<>(roomService.getRoomById(roomId),HttpStatus.OK);
    }

    @DeleteMapping("/{roomId}")
    public ResponseEntity<RoomDto> deleteRoomById(@PathVariable("hotelId") Long hotelId ,@PathVariable("roomId") Long roomId){
        roomService.deleteRoomById(roomId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
