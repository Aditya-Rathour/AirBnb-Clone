package com.adityarathour.AirbnbApp.Entity;

import com.adityarathour.AirbnbApp.Enum.Gender;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Column(nullable = false)
    String name;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Gender gender;
    Integer age;

    @CreationTimestamp
    Instant createdAt;

}
