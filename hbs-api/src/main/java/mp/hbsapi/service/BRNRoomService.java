package mp.hbsapi.service;

import mp.hbsapi.entity.BRNRoom;

import java.util.List;

public interface BRNRoomService {
    List<BRNRoom> getAllBRNRooms();

    BRNRoom addBRNRoom(BRNRoom brnRoom);
}
