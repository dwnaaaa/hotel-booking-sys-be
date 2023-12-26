package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BillPayment;
import mp.hbsapi.service.BillPaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bill-payment")
public class BillPaymentController {

    private final BillPaymentService billPaymentService;

    @GetMapping("/{brn}")
    public ResponseEntity<BillPayment> getBillPaymentByBrn(@PathVariable String brn) {
        return new ResponseEntity<>(billPaymentService.getBillPaymentByBRN(brn), HttpStatus.OK);
    }
}
