package mp.hbsapi.repository;

import mp.hbsapi.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

    @Query(value = "SELECT COUNT(*) FROM ROOM WHERE ROOM_TYPE=:type", nativeQuery = true)
    int getRoomCountByType(@Param("type") char type);

    @Query(value = "SELECT ROOM_NUMBER FROM ROOM WHERE ROOM_TYPE = ?1 AND IS_BOOKED = 0", nativeQuery = true)
    List<Integer> getAvailableRoomsByType(char type);

    @Query(value = "UPDATE ROOM SET IS_BOOKED = ?1 WHERE ROOM_NUMBER = ?2", nativeQuery = true)
    void updateVacancies(int value, int roomNumber);
}
