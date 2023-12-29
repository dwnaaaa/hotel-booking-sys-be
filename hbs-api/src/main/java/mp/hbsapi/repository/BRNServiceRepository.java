package mp.hbsapi.repository;

import mp.hbsapi.entity.BRNService;
import mp.hbsapi.entity.Product;
import mp.hbsapi.entity.key.BRNServiceKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BRNServiceRepository extends JpaRepository<BRNService, BRNServiceKey> {

}
