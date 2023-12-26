package mp.hbsapi.repository;

import mp.hbsapi.entity.BRNRoom;
import mp.hbsapi.entity.key.BRNRoomKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BRNRoomRepository extends JpaRepository<BRNRoom, BRNRoomKey> {

}
