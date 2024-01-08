package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Room;
import mp.hbsapi.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public int getRoomCountByType(char type) {
        return roomRepository.getRoomCountByType(type);
    }
}
