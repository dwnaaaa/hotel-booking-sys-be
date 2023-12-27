package mp.hbsapi.service;

import mp.hbsapi.entity.BillPayment;
import mp.hbsapi.entity.request.AddBillPaymentRequest;
import org.springframework.data.jpa.repository.query.Procedure;

public interface BillPaymentService {
    BillPayment getBillPaymentByBRN(String brn);

    @Procedure
    BillPayment addBillPayment(AddBillPaymentRequest billPaymentToAdd);
}
