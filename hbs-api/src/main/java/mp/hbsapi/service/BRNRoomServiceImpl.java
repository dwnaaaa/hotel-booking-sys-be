package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNRoom;
import mp.hbsapi.repository.BRNRoomRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BRNRoomServiceImpl implements BRNRoomService {

    private final BRNRoomRepository brnRoomRepository;

    @Override
    public BRNRoom addBRNRoom(BRNRoom brnRoom) {
        return brnRoomRepository.save(brnRoom);
    }
}
