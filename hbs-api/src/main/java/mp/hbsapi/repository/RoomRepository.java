package mp.hbsapi.repository;

import mp.hbsapi.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

    @Query(value = "SELECT COUNT(*) FROM ROOM WHERE ROOM_TYPE=:type", nativeQuery = true)
    int getRoomCountByType(@Param("type") char type);
}
