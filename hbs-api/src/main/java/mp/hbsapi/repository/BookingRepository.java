package mp.hbsapi.repository;

import mp.hbsapi.entity.BRN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<BRN, String> {

}
