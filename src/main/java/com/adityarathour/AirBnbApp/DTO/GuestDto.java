package com.adityarathour.AirbnbApp.DTO;

import com.adityarathour.AirbnbApp.Entity.User;
import com.adityarathour.AirbnbApp.Enum.Gender;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
@Data
public class GuestDto {
    Long Id;

    User user;
    String name;
    Gender gender;
    Integer age;
    Instant createdAt;
}
