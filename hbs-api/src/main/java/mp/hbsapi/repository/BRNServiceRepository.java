package mp.hbsapi.repository;

import mp.hbsapi.entity.BRNService;
import mp.hbsapi.entity.Product;
import mp.hbsapi.entity.key.BRNServiceKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BRNServiceRepository extends JpaRepository<BRNService, BRNServiceKey> {

    List<BRNService> findAllById(BRNServiceKey id);

    List<BRNService> findByIdBrn(String brn);

    @Query("SELECT SUM(s.quantity * s.price) FROM BRNService s WHERE s.id.brn = :brn")
    Double calculateTotalPriceByBRN(String brn);

    List<BRNService> findByRoomNumber(int roomNumber);

    @Query("SELECT s.id.brn FROM BRNService s WHERE s.id.brn = :brn")
    List<String> findBRNsByBRNService(@Param("brn") String brn);

    @Query("SELECT s.roomNumber FROM BRNService s WHERE s.id.brn = :brn AND s.id.serviceCode = :serviceCode")
    Integer findRoomNumber(@Param("brn") String brn, @Param("serviceCode") Integer serviceCode);
}
