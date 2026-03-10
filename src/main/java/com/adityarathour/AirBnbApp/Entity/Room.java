package com.adityarathour.AirbnbApp.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.logging.Level;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id", nullable = false)
    Hotel hotel;

    @Column(nullable = false)
    String type;

    @Column(nullable = false,precision = 10,scale = 2)
    BigDecimal basePrice;

    @CreationTimestamp
    @Column(updatable = false )
    Instant createdAt;
    @UpdateTimestamp
    Instant updatedAt;

    @Column(columnDefinition = "TEXT[]")
    String[]amenities;
    @Column(columnDefinition = "TEXT[]")
    String[] photos;

    @Column(nullable = false)
    Integer totalCount;
    @Column(nullable = false)
    Integer capacity;


}
