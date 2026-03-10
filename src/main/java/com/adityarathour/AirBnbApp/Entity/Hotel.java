package com.adityarathour.AirbnbApp.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "hotel")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @Column(nullable = false)
    String name;

    String city;

    @Column(columnDefinition = "TEXT[]")
    String[] photos;
    @Column(columnDefinition = "TEXT[]")
    String[] amenities;

    @CreationTimestamp
    Instant createdAt;

    @UpdateTimestamp
    Instant updatedAt;

    @Embedded
    HotelContactInfo hotelContactInfo;

    @Column(nullable = false)
    Boolean active;

    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    User owner;

    @OneToMany(mappedBy = "hotel")
    @JsonIgnore
    List<Room> rooms;

}
