package mp.hbsapi.service;

import mp.hbsapi.entity.BillPayment;

public interface BillPaymentService {
    BillPayment getBillPaymentByBRN(String brn);
}
