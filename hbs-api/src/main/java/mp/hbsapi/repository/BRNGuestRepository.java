package mp.hbsapi.repository;

import mp.hbsapi.entity.BRNGuest;
import mp.hbsapi.entity.key.BRNGuestKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BRNGuestRepository extends JpaRepository<BRNGuest, BRNGuestKey> {
}
