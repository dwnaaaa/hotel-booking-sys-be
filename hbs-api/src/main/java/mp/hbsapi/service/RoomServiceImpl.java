package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Room;
import mp.hbsapi.entity.request.UpdateVacancyRequest;
import mp.hbsapi.repository.RoomRepository;
import org.hibernate.sql.Update;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.orm.jpa.JpaSystemException;
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

    @Override
    public List<Integer> getAvailableRoomsByType(char type) {
        return roomRepository.getAvailableRoomsByType(type);
    }

    @Override
    public String updateBookedBrn(String brn, UpdateVacancyRequest rooms) {
        System.out.println(rooms.getRoomNumbers());
        try {
            for(int room : rooms.getRoomNumbers()) {
                roomRepository.updateBookedBrn(brn, room);
                System.out.println(room);
            }
        } catch(InvalidDataAccessResourceUsageException e) {
            e.printStackTrace();

        } return "Vacancy changed";
    }
}
