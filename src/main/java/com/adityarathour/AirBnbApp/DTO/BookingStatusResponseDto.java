package com.adityarathour.AirbnbApp.DTO;

import com.adityarathour.AirbnbApp.Enum.BookingStatus;
import com.adityarathour.AirbnbApp.Enum.BookingStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingStatusResponseDto {
    private BookingStatus bookingStatus;


}
