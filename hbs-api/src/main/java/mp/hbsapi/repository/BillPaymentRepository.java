package mp.hbsapi.repository;

import mp.hbsapi.entity.BillPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BillPaymentRepository extends JpaRepository<BillPayment, Long> {
    BillPayment findByBrn(String brn);

    @Procedure(name = "BillPayment.addBillPayment")
    BillPayment addBillPayment(@Param("in_brn") String brn, @Param("in_total") int total,
                               @Param("in_payment_method") char paymentMethod, @Param("in_card_id") String cardId);
}
