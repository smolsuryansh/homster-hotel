package com.hammy.homster_hotel.repository;

import com.hammy.homster_hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
