package com.adityarathour.AirbnbApp.DTO;

import com.adityarathour.AirbnbApp.Entity.Guest;
import com.adityarathour.AirbnbApp.Entity.Hotel;
import com.adityarathour.AirbnbApp.Entity.Room;
import com.adityarathour.AirbnbApp.Entity.User;
import com.adityarathour.AirbnbApp.Enum.BookingStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingDto {

        Long id;

        Integer roomsCount;

        LocalDateTime createdAt;
        LocalDateTime updatedAt;

        BookingStatus bookingStatus;
        LocalDate checkInDate;
        LocalDate checkOutDate;
        Set<GuestDto> guests;



    }


