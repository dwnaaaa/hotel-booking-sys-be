package mp.hbsapi.repository;

import mp.hbsapi.entity.BRNRoom;
import mp.hbsapi.entity.key.BRNRoomKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BRNRoomRepository extends JpaRepository<BRNRoom, BRNRoomKey> {

    @Query("SELECT 'r.ROOM_NUMBER' FROM BRN_ROOMS r WHERE r.id.brn = :brn")
    Integer findRoomNumberByBrn(@Param("brn") String brn);

}
