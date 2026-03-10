package com.adityarathour.AirbnbApp.DTO;

import com.adityarathour.AirbnbApp.Entity.HotelContactInfo;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HotelDto {
    Long id;
    String name;

    String city;

    String[] photos;
    String[] amenities;

    HotelContactInfo ContactInfo;
    Boolean active;

}
