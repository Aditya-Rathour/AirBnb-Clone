package com.adityarathour.AirbnbApp.Repository;

import com.adityarathour.AirbnbApp.Entity.Guest;
import com.adityarathour.AirbnbApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}
