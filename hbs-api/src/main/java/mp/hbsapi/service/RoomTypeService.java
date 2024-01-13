package mp.hbsapi.service;

import mp.hbsapi.entity.RoomType;

import java.util.List;

public interface RoomTypeService {

    List<RoomType> getAllRoomTypes();

    int getRoomPrice(char roomType);
}
