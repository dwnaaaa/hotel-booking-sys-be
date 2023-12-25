package mp.hbsapi.repository;

import mp.hbsapi.entity.BRN;
import mp.hbsapi.entity.BillPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingRepository extends JpaRepository<BRN, Long> {

    @Query("SELECT b FROM BRN b WHERE b.checkInDate IS NOT NULL AND b.checkOutDate IS NOT NULL")
    List<BRN> findAllConfirmedBookings();

    @Query("SELECT bp FROM BillPayment bp WHERE bp.brn = :brn")
    BillPayment findBillPaymentByBrn(@Param("brn") String brn);
}
