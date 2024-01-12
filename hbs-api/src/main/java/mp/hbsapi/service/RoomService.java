package mp.hbsapi.service;

import mp.hbsapi.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRooms();

    int getRoomCountByType(char type);

    List<Integer> getAvailableRoomsByType(char type);
}
