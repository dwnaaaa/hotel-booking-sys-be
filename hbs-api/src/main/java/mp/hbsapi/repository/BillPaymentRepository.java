package mp.hbsapi.repository;

import mp.hbsapi.entity.BillPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillPaymentRepository extends JpaRepository<BillPayment, Long> {
    BillPayment findByBrn(String brn);
}
