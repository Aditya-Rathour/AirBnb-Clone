package com.adityarathour.AirbnbApp.Repository;

import com.adityarathour.AirbnbApp.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
}
