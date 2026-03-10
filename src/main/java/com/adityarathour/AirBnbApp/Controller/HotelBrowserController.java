package com.adityarathour.AirbnbApp.Controller;

import com.adityarathour.AirbnbApp.DTO.*;
import com.adityarathour.AirbnbApp.Service.HotelService;
import com.adityarathour.AirbnbApp.Service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hotels")
public class HotelBrowserController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @GetMapping("/search")
    public ResponseEntity<Page<HotelPriceResponseDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest){
        var page =  inventoryService.searchHotels(hotelSearchRequest);
        return new ResponseEntity<>(page, HttpStatus.OK);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId){
        return new ResponseEntity<>(hotelService.getHotelInfoById(hotelId),HttpStatus.OK);
    }
}
