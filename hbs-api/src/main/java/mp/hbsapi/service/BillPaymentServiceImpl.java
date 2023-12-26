package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BillPayment;
import mp.hbsapi.repository.BillPaymentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BillPaymentServiceImpl implements BillPaymentService {

    private final BillPaymentRepository billPaymentRepository;

    @Override
    public BillPayment getBillPaymentByBRN(String brn) {
        return billPaymentRepository.findByBrn(brn);
    }
}
