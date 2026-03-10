package com.adityarathour.AirbnbApp.DTO;

import com.adityarathour.AirbnbApp.Entity.Hotel;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomDto {
    Long id;
    String type;
    BigDecimal basePrice;
    Integer totalCount;
    Integer capacity;
    String[]amenities;
    String[] photos;

}
