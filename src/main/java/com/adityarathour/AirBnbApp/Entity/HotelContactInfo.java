package com.adityarathour.AirbnbApp.Entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Embeddable
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HotelContactInfo {
    String address;
    String location;
    String email;

    String phoneNumber;

}
