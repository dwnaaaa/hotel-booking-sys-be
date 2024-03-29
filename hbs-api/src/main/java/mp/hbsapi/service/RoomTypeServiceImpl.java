package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.RoomType;
import mp.hbsapi.repository.RoomTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomTypeServiceImpl implements RoomTypeService{

    private final RoomTypeRepository roomTypeRepository;

    @Override
    public List<RoomType> getAllRoomTypes() {
        return roomTypeRepository.findAll();
    }

    @Override
    public int getRoomPrice(char roomType) {
        RoomType roomTypeEntity = roomTypeRepository.findByRoomType(roomType);
        return (roomTypeEntity != null) ? roomTypeEntity.getPrice() : 0;
    }
}
