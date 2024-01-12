package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BillPayment;
import mp.hbsapi.entity.request.AddBillPaymentRequest;
import mp.hbsapi.service.BillPaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/bill-payment")
public class BillPaymentController {

    private final BillPaymentService billPaymentService;

    @GetMapping("/{brn}")
    public ResponseEntity<BillPayment> getBillPaymentByBrn(@PathVariable String brn) {
        return new ResponseEntity<>(billPaymentService.getBillPaymentByBRN(brn), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<BillPayment> addBillPayment(@RequestBody AddBillPaymentRequest billPaymentToAdd) {
        return new ResponseEntity<>(billPaymentService.addBillPayment(billPaymentToAdd), HttpStatus.CREATED);
    }
}
