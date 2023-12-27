package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNRoom;
import mp.hbsapi.repository.BRNRoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BRNRoomServiceImpl implements BRNRoomService {

    private final BRNRoomRepository brnRoomRepository;

    @Override
    public List<BRNRoom> getAllBRNRooms() {
        return brnRoomRepository.findAll();
    }

    @Override
    public BRNRoom addBRNRoom(BRNRoom brnRoom) {
        return brnRoomRepository.save(brnRoom);
    }
}
