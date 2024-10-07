package com.hammy.homster_hotel.service;

import com.hammy.homster_hotel.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

public interface RoomService {

    Room addNewUser(MultipartFile photo, String roomType, BigDecimal roomPrice) throws SQLException, IOException;
}
